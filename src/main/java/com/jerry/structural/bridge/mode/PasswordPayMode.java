package com.jerry.structural.bridge.mode;

/**
 * 密码方式安全校验
 *
 * @author qijie
 * @date 2023/7/6
 */
public class PasswordPayMode implements IPayMode {
    @Override
    public boolean isSecurity(String uId) {
        System.out.println("密码支付安全校验");
        return true;
    }
}
