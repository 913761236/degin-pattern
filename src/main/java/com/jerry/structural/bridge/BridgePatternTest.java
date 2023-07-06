package com.jerry.structural.bridge;

import java.math.BigDecimal;
import java.util.UUID;

import com.jerry.structural.bridge.client.AliPayClient;
import com.jerry.structural.bridge.client.WeChatPayClient;
import com.jerry.structural.bridge.mode.FaceIdPayMode;
import com.jerry.structural.bridge.mode.FingerPrintPayMode;

/**
 * 桥接模式<br/>
 * 对于一个功能模块有两个独立演化的维度时，可以将分别从这两个维度进行抽象，然后使用桥接模式进行聚合<br/>
 * 缺点：演化的方向多会导致类增多，设计复杂度会上升<br/>
 *
 * @author qijie
 * @date 2023/7/6
 */
public class BridgePatternTest {

    public static void main(String[] args) {
        WeChatPayClient weChatPayClient = new WeChatPayClient(new FaceIdPayMode());
        System.out.println(weChatPayClient.transfer(UUID.randomUUID().toString(), UUID.randomUUID().toString(),
            new BigDecimal("6.66")));

        AliPayClient aliPayClient = new AliPayClient(new FingerPrintPayMode());
        System.out.println(aliPayClient.transfer(UUID.randomUUID().toString(), UUID.randomUUID().toString(),
                                                    new BigDecimal("6.66")));
    }

}
