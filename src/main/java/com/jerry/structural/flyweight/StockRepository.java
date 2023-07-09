package com.jerry.structural.flyweight;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 库存服务（不稳定部分信息的来源）
 *
 * @author qijie
 * @date 2023/7/9
 */
public class StockRepository {

    /**
     * 模拟从Redis或者数据库中读取这部分变动信息
     */
    public Stock fetchStock(Long id) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int total = random.nextInt(100);
        int used = total - random.nextInt(total);
        return new Stock(total, used);
    }

}
