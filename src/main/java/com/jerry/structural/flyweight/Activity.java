package com.jerry.structural.flyweight;

import java.util.Date;

/**
 * 商品活动信息类<br/>
 *
 * @author qijie
 * @date 2023/7/9
 */
public class Activity {

    public Long id;

    public String name;

    public Date startTime;

    public Date endTime;

    public Stock stock;

    public Activity(Long id, String name, Date startTime, Date endTime) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

}
