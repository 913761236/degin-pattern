package com.jerry.structural.composite;

import java.util.List;

/**
 * 组合元素的共性抽象
 *
 * @author qijie
 * @date 2023/7/12
 */
public abstract class Entry {

    private String name;

    public Entry(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract List<Entry> getChildren();

    public abstract void addEntry(Entry entry);

    public abstract long getSize();

}
