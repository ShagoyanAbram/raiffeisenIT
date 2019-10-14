package com.abram.java.collection.iterator;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Three", "Four"};
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        boolean[] booleans = {true, false, false, true, true};
        int[] ints = {1, 2, 3, 4, 5, 6};
        double[] doubles = {5.5, 4.4, 3.3, 2.2, 1.1};
        float[] floats = {5.5f, 4.4f, 3.3f, 2.2f, 1.1f};
        long[] longs = {1,2,3,4,5,6,7,8,9,0};
        byte[] bytes = {1,2,3,4,5,6,7,8,9};
        short[] shorts = {1,2,3};
        char[] chars = {'A','B','C'};

        SelfIterator selfIterator = new SelfIterator(PrimitiveParser.parser(ints));
        while (selfIterator.hasNext()) {
            System.out.println(selfIterator.next());
        }
//        selfIterator.forEachRemaining(System.out::println);
//        System.out.println("::");
//        selfIterator.remove();
//        selfIterator.forEachRemaining(System.out::println);
//        System.out.println("::");
//        selfIterator.remove();
//        selfIterator.forEachRemaining(System.out::println);
//        System.out.println("::");
//        selfIterator.remove();
//        selfIterator.forEachRemaining(System.out::println);
    }
}
