package com.jerry.structural.bridge.mode;

/**
 * 支付方式抽象接口
 *
 * @author qijie
 * @date 2023/7/6
 */
public interface IPayMode {

    /**
     * 支付方式安全校验
     */
    boolean isSecurity(String uId);

}
