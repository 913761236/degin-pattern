package com.jerry.structural.decorator;

/**
 * 抽象
 *
 * @author qijie
 * @date 2023/7/8
 */
public interface DataLoader {

    String read();

    void write(String data);

}
