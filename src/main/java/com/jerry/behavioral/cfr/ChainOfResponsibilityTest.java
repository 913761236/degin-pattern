package com.jerry.behavioral.cfr;

/**
 * 责任链模式<br/>
 * 将各个服务节点进行连接，根据业务等级不同，动态的调节执行业务的层级<br/>
 * 不同等级走不同的链路长度<br/>
 *
 * @author qijie
 * @date 2023/7/10
 */
public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        AuthLink authLink = new LevelThreeAuth("003", "王总")
            .appendNext(new LevelTwoAuth("002", "赵总管").appendNext(new LevelOneAuth("001", "钱导")));

        authLink.doAuth("交付1", "004", 2);
        authLink.doAuth("交付2", "005", 3);
    }

}
