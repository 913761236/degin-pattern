package com.jerry.structural.decorator;

/**
 * 装饰器模式<br/>
 *
 * @author qijie
 * @date 2023/7/8
 */
public class DecoratorPatternTest {

    public static void main(String[] args) {
        DataLoader loader = new BaseDataLoader();

        DataLoader decorator = new EncryptionDataDecorator(loader);

        decorator.write("原始数据");
        System.out.println(decorator.read());
    }
}
