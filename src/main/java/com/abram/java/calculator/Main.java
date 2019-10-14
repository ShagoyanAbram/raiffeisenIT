package com.abram.java.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        start();
    }

    public static void start() throws Exception {
        System.out.println("Введите выражение: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            double res = Сalculator.calculator(str);
            System.out.println(res);
        }
    }
}

