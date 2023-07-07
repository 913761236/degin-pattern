package com.jerry.structural.adapter;

/**
 * 被适配类抽象
 *
 * @author qijie
 * @date 2023/7/7
 */
public interface TFCard {

    String readTF();

    void writeTF(String data);

}
