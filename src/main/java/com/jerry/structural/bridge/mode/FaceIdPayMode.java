package com.jerry.structural.bridge.mode;

/**
 * 面容支付方式
 * 
 * @author qijie
 * @date 2023/7/6
 */
public class FaceIdPayMode implements IPayMode {
    @Override
    public boolean isSecurity(String uId) {
        System.out.println("面容支付方式安全检验");
        return true;
    }
}
