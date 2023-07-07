package com.jerry.structural.adapter;

/**
 * description
 *
 * @author qijie
 * @date 2023/7/7
 */
public class Computer {

    public String readSDCard(SDCard sdCard) {
        return sdCard.read();
    }
}
