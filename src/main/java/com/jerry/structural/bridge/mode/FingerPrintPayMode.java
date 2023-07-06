package com.jerry.structural.bridge.mode;

/**
 * 指纹支付方式
 *
 * @author qijie
 * @date 2023/7/6
 */
public class FingerPrintPayMode implements IPayMode{
    @Override
    public boolean isSecurity(String uId) {
        System.out.println("指纹支付方式安全校验");
        return true;
    }
}
