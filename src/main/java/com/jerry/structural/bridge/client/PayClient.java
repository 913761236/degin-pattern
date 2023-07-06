package com.jerry.structural.bridge.client;

import java.math.BigDecimal;

import com.jerry.structural.bridge.mode.IPayMode;

/**
 * 支付机构抽象
 *
 * @author qijie
 * @date 2023/7/6
 */
public abstract class PayClient {

    protected IPayMode payMode;

    protected PayClient(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
