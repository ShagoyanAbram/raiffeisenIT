package com.abram.moon;

public class CardValidator {

    public static boolean algorithmMoon(String kartNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        if (kartNumber.length() % 2 == 0) {
            for (int i = 0; i < kartNumber.length(); i += 2) {
                int indexToNumber = Integer.parseInt(String.valueOf((kartNumber.charAt(i))));
                if (2 * indexToNumber > 9) {
                    count += 2 * indexToNumber - 9;
                } else {
                    count += 2 * indexToNumber;
                }
            }
        }

        if (kartNumber.length() % 2 == 1) {
            for (int i = 1; i < kartNumber.length(); i += 2) {
                int indexToNumber = Integer.parseInt(String.valueOf((kartNumber.charAt(i))));
                if (2 * indexToNumber > 9) {
                    count += 2 * indexToNumber - 9;
                } else {
                    count += 2 * indexToNumber;
                }
            }
        }

        return count % 10 == 0;
    }

    public static void main(String[] args) {
        System.out.println(algorithmMoon("4276888813779984"));
    }
}