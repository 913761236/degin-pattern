package com.jerry.structural.flyweight;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * description
 *
 * @author qijie
 * @date 2023/7/9
 */
public class ActivityFactory {

    private final Map<Long, Activity> CACHE = new HashMap<>();

    private ActivityFactory() {
        Date now = new Date();
        Activity a1 = new Activity((long)1, "商品1", now, now);
        Activity a2 = new Activity((long)2, "商品2", now, now);
        CACHE.put(a1.id, a1);
        CACHE.put(a2.id, a2);
    }

    public static ActivityFactory getInstance() {
        return ActivityFactoryHolder.getSingleton();
    }

    public Activity getActivity(Long id) {
        // 1. 从内部缓存获取不变的部分
        Activity activity = CACHE.get(id);
        if (activity == null) {
            return null;
        }
        // 2. 再从存储服务中获取变化的部分进行组装
        StockRepository repository = new StockRepository();
        activity.stock = repository.fetchStock(id);
        // 3. 这样在并发请求下，商品活动中的商品信息无论多少次请求只会占用一份内存，而不是一个请求占用一份内存
        return activity;
    }

    private static class ActivityFactoryHolder {

        private static final ActivityFactory SINGLETON = new ActivityFactory();

        public static ActivityFactory getSingleton() {
            return SINGLETON;
        }
    }
}
