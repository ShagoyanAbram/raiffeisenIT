package com.abram.homework.five.calculator;

import java.util.Scanner;

public class Сalculator {
    public static final String MINUS = "-";
    public static final String PLUS = String.valueOf('+');
    public static final String MUL = String.valueOf('*');
    public static final String DIF = "/";

    private static Scanner sc = new Scanner(System.in);

    public static double calculator(String arithmeticValue) throws Exception {
        Number n1 = 0;
        Number n2 = 0;
        double result = 0;
        try {
            arithmeticValue = arithmeticValue.replaceAll(" ", "");
            if (arithmeticValue.contains(MINUS)) {
                String[] split = arithmeticValue.split(MINUS);
                n1 = getNumber(split[0]);
                n2 = getNumber(split[1]);
                result = (double) n1 - (double) n2;
            } else if (arithmeticValue.contains(PLUS)) {
                String[] split = arithmeticValue.split("\\+");
                n1 = getNumber(split[0]);
                n2 = getNumber(split[1]);
                result = (double) n1 + (double) n2;
            } else if (arithmeticValue.contains(MUL)) {
                String[] split = arithmeticValue.split("\\*");
                n1 = getNumber(split[0]);
                n2 = getNumber(split[1]);
                result = (double) n1 * (double) n2;
            } else if (arithmeticValue.contains(DIF)) {
                String[] split = arithmeticValue.split(DIF);
                n1 = getNumber(split[0]);
                n2 = getNumber(split[1]);
                if ((double) n2 == 0) {
                    throw new ZeroException("Вы делите на 0. Введите другой знаменатель");
                }
                result = (double) n1 / (double) n2;
            } else {
                throw new IncorrectOperationException("Введены некорректные данные. Введите другое выражение.");
            }
        } catch (ZeroException e) {
            System.out.println(e.getMessage());
            result = enterSecondNumber((double) n1);
        } catch (IncorrectOperationException e) {
            System.out.println(e.getMessage());
            Main.start();
        }
        return result;
    }

    public static double enterSecondNumber(double d) throws Exception {
        try {
            while (true) {
                String s = sc.nextLine();
                double number = (double) getNumber(s);
                if (number != 0) {
                    return d / number;
                }
                System.out.println("Вы ввели опять нуль! Введите другое число!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            enterSecondNumber(d);
        }
        throw new Exception();
    }

    public static Number getNumber(String number) throws Exception {
        if (Checker.isDouble(number)) {
            return Double.parseDouble(number);
        } else if (Checker.isInteger(number)) {
            return Integer.parseInt(number);
        } else {
            throw new Exception("Вы ввели какую то дичь");
        }
    }
}
