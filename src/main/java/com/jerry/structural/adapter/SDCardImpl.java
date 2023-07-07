package com.jerry.structural.adapter;

/**
 * 目标类具体实现
 *
 * @author qijie
 * @date 2023/7/7
 */
public class SDCardImpl implements SDCard {

    @Override
    public String read() {
        return "从SD Card中读取数据";
    }

    @Override
    public void write(String data) {
        System.out.println("将数据写入SD Card：" + data);
    }
}
