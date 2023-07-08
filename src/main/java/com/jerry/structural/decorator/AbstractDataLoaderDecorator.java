package com.jerry.structural.decorator;

/**
 * 装饰抽象
 *
 * @author qijie
 * @date 2023/7/8
 */
public class AbstractDataLoaderDecorator implements DataLoader {

    protected DataLoader loader;

    protected AbstractDataLoaderDecorator(DataLoader loader) {
        this.loader = loader;
    }

    @Override
    public String read() {
        return loader.read();
    }

    @Override
    public void write(String data) {
        loader.write(data);
    }
}
