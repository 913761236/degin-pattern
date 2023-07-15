package com.jerry.behavioral.visitor;

import java.time.LocalDate;

/**
 * 具体数据
 *
 * @author qijie
 * @date 2023/7/15
 */
public class Fruit extends Product {

    private double weight;

    public Fruit(String name, LocalDate produceDate, double price, double weight) {
        super(name, produceDate, price);
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visit) {
        visit.visit(this);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
