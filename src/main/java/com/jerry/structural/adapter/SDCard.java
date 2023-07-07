package com.jerry.structural.adapter;

/**
 * 目标类抽象
 *
 * @author qijie
 * @date 2023/7/7
 */
public interface SDCard {

    String read();

    void write(String data);

}
