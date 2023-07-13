package com.jerry.behavioral.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * description
 *
 * @author qijie
 * @date 2023/7/13
 */
public class ZKGoodDiscount implements GoodDiscount {

    private final BigDecimal per;

    public ZKGoodDiscount(BigDecimal per) {
        this.per = per;
    }

    @Override
    public BigDecimal discountAmount(BigDecimal price) {
        return price.multiply(per).setScale(2, RoundingMode.HALF_UP);
    }
}
