package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    List<T> items;
    int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>(this.maxSize);
    }

    public void add (T item) {
        if (this.items.size() < this.maxSize) {
            this.items.add(item);
        } else {
            System.out.println("The List is Full!");
            throw new RuntimeException();
        }
    }

    public List<T> getItems() {
        return items;
    }
}
