package com.jerry.behavioral.visitor;

import java.time.LocalDate;

/**
 * 抽象类，提供数据
 *
 * @author qijie
 * @date 2023/7/15
 */
public abstract class Product implements Acceptable {

    /**
     * 商品名称
     */
    private String name;

    /**
     * 生产日期
     */
    private LocalDate produceDate;

    /**
     * 价格
     */
    private double price;

    public Product(String name, LocalDate produceDate, double price) {
        this.name = name;
        this.produceDate = produceDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProduceDate() {
        return produceDate;
    }

    public void setProduceDate(LocalDate produceDate) {
        this.produceDate = produceDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
