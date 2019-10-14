package com.abram.java.collection.iterator;

import java.util.*;
import java.util.function.Consumer;

public class SelfIterator implements Iterator {
    private int cursor;
    private Object[] array;

    public SelfIterator(Object[] objects) {
        this.cursor = 0;
        this.array = objects;
    }

    @Override
    public boolean hasNext() {
        return cursor != array.length;
    }

    @Override
    public Object next() {
        if (cursor > array.length) throw new NoSuchElementException();
        int index = cursor;
        cursor++;
        return array[index];
    }

    @Override
    public void remove() {
        Object[] objects = new Object[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            objects[i] = array[i];
        }
        if (cursor > 0) {
            cursor--;
        }
        array = objects;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i = cursor;
        if (i >= array.length) {
            return;
        }
        while (i != array.length) {
            consumer.accept(array[(i++)]);
        }
    }
}


