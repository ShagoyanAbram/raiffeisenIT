package com.abram.java.collection.array_list;

public interface FunctionMyArray<E> extends Iterable<E> {
    boolean add(E e);

    void remove(int index);

    boolean contains(E e);

    E get(int index);

    E getElem(E e);

    int size();

    void update(int index, E e);
}
