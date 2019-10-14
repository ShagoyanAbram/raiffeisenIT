package com.abram.java.leak;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeak {
    public static List<Long> list = new ArrayList<>();

    public static void main(String[] args) {
        long i = 0;
        while (true) {
            list.add(i);
            i++;
        }
    }
}
