package com.jerry.structural.decorator;

/**
 * 具体实现组件
 *
 * @author qijie
 * @date 2023/7/8
 */
public class BaseDataLoader implements DataLoader {

    private String data;

    @Override
    public String read() {
        return data;
    }

    @Override
    public void write(String data) {
        this.data = data;
        System.out.println(data);
    }

}
