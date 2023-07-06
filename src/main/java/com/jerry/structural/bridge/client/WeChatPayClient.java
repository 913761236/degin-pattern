package com.jerry.structural.bridge.client;

import com.jerry.structural.bridge.mode.IPayMode;

import java.math.BigDecimal;

/**
 * 微信支付渠道
 *
 * @author qijie
 * @date 2023/7/6
 */
public class WeChatPayClient extends PayClient {

    public WeChatPayClient(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        if (payMode.isSecurity(uId)) {
          return "微信渠道支付划账成功";
        }
        return "微信渠道支付划账失败";
    }
}
