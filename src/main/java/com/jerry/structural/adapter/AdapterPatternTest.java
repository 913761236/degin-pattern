package com.jerry.structural.adapter;

/**
 * 适配器模式<br/>
 * 1. 实现目标类的接口<br/>
 * 2. 聚合被适配类（对象适配器模式）或者继承被适配类（继承适配器模式）<br/>
 *
 * @author qijie
 * @date 2023/7/7
 */
public class AdapterPatternTest {

    public static void main(String[] args) {
        Computer computer = new Computer();

        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSDCard(sdCard));

        TFCard tfCard = new TFCardImpl();
        SDCardAdapter adapter = new SDCardAdapter(tfCard);
        System.out.println(computer.readSDCard(adapter));
    }

}
