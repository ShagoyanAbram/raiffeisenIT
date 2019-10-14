package com.abram.java.calculator;

public class Checker {
    public static boolean isDouble(String number) {
        try {
            double d = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isInteger(String number) {
        try {
            double d = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
