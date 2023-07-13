package com.jerry.behavioral.strategy;

import java.math.BigDecimal;

/**
 * 商品优惠策略
 *
 * @author qijie
 * @date 2023/7/13
 */
public interface GoodDiscount {

    BigDecimal discountAmount(BigDecimal price);

}
