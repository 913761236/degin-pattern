package com.jerry.behavioral.strategy;

import java.math.BigDecimal;

/**
 * 策略模式<br/>
 * 包装算法，优化if else<br/>
 *
 * @author qijie
 * @date 2023/7/13
 */
public class StrategyPatternTest {

    public static void main(String[] args) {
        MJGoodDiscount mjDiscount = new MJGoodDiscount(new BigDecimal("500"), new BigDecimal("50"));
        ZKGoodDiscount zkDiscount = new ZKGoodDiscount(new BigDecimal("0.7"));
        System.out.println(mjDiscount.discountAmount(new BigDecimal(600)));
        System.out.println(zkDiscount.discountAmount(new BigDecimal(500)));
    }

}
