package com.jerry.behavioral.visitor;

import java.time.LocalDate;

/**
 * description
 *
 * @author qijie
 * @date 2023/7/15
 */
public class DiscountVisit implements Visitor {

    private LocalDate billDate;

    public DiscountVisit(LocalDate billDate) {
        this.billDate = billDate;
        System.out.println("结算日期：" + billDate);
    }

    @Override
    public void visit(Candy candy) {
        // 超过180天，禁止售卖，不然9折
        long interval = billDate.toEpochDay() - candy.getProduceDate().toEpochDay();
        if (interval > 180) {
            System.out.println("超过半年的糖果不允许售卖");
        }
        else {
            double price = candy.getPrice() * 0.9;
            System.out.println("糖果的价格是：" + price);
        }
    }

    @Override
    public void visit(Fruit fruit) {
        // 水果超过7天的不能售卖
        long interval = billDate.toEpochDay() - fruit.getProduceDate().toEpochDay();
        if (interval > 7) {
            System.out.println("水果超过7天不允许售卖");
        }

        // 超过5天的打七折
        if (interval > 5) {
            System.out.println("糖果的价格是：" + fruit.getWeight() * fruit.getPrice() * 0.7);
        }
        else {
            System.out.println("糖果的价格是：" + fruit.getWeight() * fruit.getPrice());
        }
    }

    @Override
    public void visit(Wine wine) {
        System.out.println("酒水的价格是：" + wine.getPrice());
    }
}
