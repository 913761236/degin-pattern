package com.jerry.structural.flyweight;

/**
 * 活动商品库存信息
 *
 * @author qijie
 * @date 2023/7/9
 */
public class Stock {

    public int total;

    public int used;

    public Stock(int total, int used) {
        this.total = total;
        this.used = used;
    }
}
