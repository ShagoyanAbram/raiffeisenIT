package com.abram.java.collection.array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test");
        System.out.println(list.contains("Test"));

        FunctionMyArray<String> arrayList = new MyArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");


        arrayList.update(1, "test");
        arrayList.remove(1);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("One"));
        System.out.println(arrayList.getElem("One"));
        System.out.println(arrayList.getElem("Six"));
    }
}
