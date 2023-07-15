package com.jerry.behavioral.visitor;

import java.time.LocalDate;

/**
 * 具体数据
 *
 * @author qijie
 * @date 2023/7/15
 */
public class Candy extends Product {
    public Candy(String name, LocalDate produceDate, double price) {
        super(name, produceDate, price);
    }

    @Override
    public void accept(Visitor visit) {
        visit.visit(this);
    }
}
