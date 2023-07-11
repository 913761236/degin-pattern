package com.jerry.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author qijie
 * @date 2023/7/12
 */
public class Directory extends Entry {

    private List<Entry> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public List<Entry> getChildren() {
        return children;
    }

    @Override
    public void addEntry(Entry entry) {
        children.add(entry);
    }

    @Override
    public long getSize() {
        long size = 0;
        for (Entry child : this.getChildren()) {
            if (child != null) {
                size += child.getSize();
            }
        }
        return size;
    }
}
