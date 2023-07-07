package com.jerry.structural.adapter;

/**
 * 适配器类
 *
 * @author qijie
 * @date 2023/7/7
 */
public class SDCardAdapter implements SDCard {

    private TFCard tfCard;

    public SDCardAdapter(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String read() {
        return tfCard.readTF();
    }

    @Override
    public void write(String data) {
        tfCard.writeTF(data);
    }

    public void setTfCard(TFCard tfCard) {
        this.tfCard = tfCard;
    }
}
