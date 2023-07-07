package com.jerry.structural.adapter;

/**
 * 被适配类具体实现
 *
 * @author qijie
 * @date 2023/7/7
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "从TF Card中读取数据";
    }

    @Override
    public void writeTF(String data) {
        System.out.println("将数据写入TF Card：" + data);
    }
}
