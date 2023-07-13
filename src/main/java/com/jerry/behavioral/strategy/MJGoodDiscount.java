package com.jerry.behavioral.strategy;

import java.math.BigDecimal;

/**
 * 满减优惠
 *
 * @author qijie
 * @date 2023/7/13
 */
public class MJGoodDiscount implements GoodDiscount {

    private final BigDecimal floor;

    private final BigDecimal cut;

    public MJGoodDiscount(BigDecimal floor, BigDecimal cut) {
        this.floor = floor;
        this.cut = cut;
    }

    @Override
    public BigDecimal discountAmount(BigDecimal price) {
        if (floor.compareTo(price) < 0) {
            System.out.println("满" + floor + "优惠" + cut.toString());
            return price.subtract(cut);
        }
        return price;
    }
}
