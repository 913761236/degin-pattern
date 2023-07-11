package com.jerry.structural.composite;

import java.util.List;

/**
 * description
 *
 * @author qijie
 * @date 2023/7/12
 */
public class File extends Entry {

    private long size;

    public File(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public List<Entry> getChildren() {
        return null;
    }

    @Override
    public void addEntry(Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long getSize() {
        return size;
    }

}
