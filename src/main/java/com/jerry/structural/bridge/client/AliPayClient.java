package com.jerry.structural.bridge.client;

import java.math.BigDecimal;

import com.jerry.structural.bridge.mode.IPayMode;

/**
 * 支付宝支付渠道
 *
 * @author qijie
 * @date 2023/7/6
 */
public class AliPayClient extends PayClient {

    public AliPayClient(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        if (payMode.isSecurity(uId)) {
            return "支付宝渠道支付划账成功";
        }
        return "支付宝渠道支付划账失败";
    }
}
