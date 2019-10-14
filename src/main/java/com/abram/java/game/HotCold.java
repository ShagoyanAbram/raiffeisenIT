package com.abram.java.game;

import java.util.Scanner;

public class HotCold {

    public static int randomNumber(final int max) {
        return (int) (Math.random() * max);
    }

    public static void resultGame(int random) {
        int numberOfAttempts = 0;
        int previousPlayerValue;

        Scanner sc = new Scanner(System.in);
        int valueEnteredByPlayer = sc.nextInt();
        if (valueEnteredByPlayer == random) {
            System.out.println("Успех");
            return;
        }
        numberOfAttempts++;
        previousPlayerValue = valueEnteredByPlayer;

        while (numberOfAttempts >= 1) {
            valueEnteredByPlayer = sc.nextInt();
            if (valueEnteredByPlayer == random) {
                System.out.println("Успех");
                break;
            } else if (Math.abs(random - previousPlayerValue) > Math.abs(random - valueEnteredByPlayer)) {
                System.out.println("Горячо");
            } else {
                System.out.println("Холодно");
            }
            previousPlayerValue = valueEnteredByPlayer;
        }
    }
}