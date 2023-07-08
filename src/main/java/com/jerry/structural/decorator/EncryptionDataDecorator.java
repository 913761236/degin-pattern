package com.jerry.structural.decorator;

/**
 * description
 *
 * @author qijie
 * @date 2023/7/8
 */
public class EncryptionDataDecorator extends AbstractDataLoaderDecorator {

    protected EncryptionDataDecorator(DataLoader loader) {
        super(loader);
    }

    @Override
    public String read() {
        String data = loader.read();
        return this.decode(data);
    }

    @Override
    public void write(String data) {
        loader.write(this.encode(data));
    }

    private String encode(String data) {
        return "加密数据：---" + data;
    }

    private String decode(String data) {
        return data.replaceFirst("加密数据：---", "");
    }
}
