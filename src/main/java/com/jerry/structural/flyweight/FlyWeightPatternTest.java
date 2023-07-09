package com.jerry.structural.flyweight;

/**
 * 享元模式<br/>
 * 享元模式主要用于共享通用对象，减少内存的使用，提升系统的访问效率<br/>
 * 享元模式通常会和单例模式和工厂模式一起出现<br/>
 * 享元模式的关键点在于区分内部状态（不变的，稳定的部分）和外部状态（变动的，不稳定的部分）
 *
 * @author qijie
 * @date 2023/7/9
 */
public class FlyWeightPatternTest {

    public static void main(String[] args) {
        ActivityFactory factory = ActivityFactory.getInstance();

        Activity a1 = factory.getActivity((long)1);
        Activity a2 = factory.getActivity((long)1);

        System.out.println(a1 == a2);
    }

}
