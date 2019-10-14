package com.abram.java.special_tools.generics;

public class Aggregator<T extends Number> {

    private T[] array;

    public Aggregator(T[] array) {
        this.array = array;
    }

    public T searchMaxItem() {
        T maxItem = array[0];
        for (Number item : array) {
            if (item.doubleValue() > maxItem.doubleValue()) {
                maxItem = (T) item;
            }
        }
        return maxItem;
    }

    public T searchMinItem() {
        T minItem = array[0];
        for (Number item : array) {
            if (item.doubleValue() < minItem.doubleValue()) {
                minItem = (T) item;
            }
        }
        return minItem;
    }

    public Number arithmeticMean() {
        double mean = 0;
        for (Number item : array) {
                mean += item.doubleValue();
        }
        return mean / array.length;
    }

    public static void main(String[] args) {
        Object[] objects = {1, 2, 3, 4, 5, 55, 0, 11};
        Number[] number = {1, 2, -3, 4.5, 4};
        Integer[] integers = {1, 2, 3, 4, -5, 55, 0, 11};
        Long[] longs = {1L, 2L, 3L, -4L, 5L, 55L, 0L, 11L};
        Short[] shorts = {1, 2, 3, 4, 5, 55, 0, 11};
        Byte[] bytes = {1, 2, 3, 4, 5, 55, 0, 11};
        Float[] floats = {44.00f, 4f, 3.11f, 55.57f, 45.99f};
        Double[] doubles = {44.00d, 4d, 3.11d, 55.57d, 45.99d};
        Aggregator aggregator = new Aggregator(integers);
        System.out.println(aggregator.searchMaxItem());
        System.out.println(aggregator.searchMinItem());
        System.out.println(aggregator.arithmeticMean());
    }
}
