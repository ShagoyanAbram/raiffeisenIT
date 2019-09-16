package com.abram.game;

import java.util.Scanner;

public class HotCold {

    public static int randomNumber(final int max) {
        return (int) (Math.random() * max);
    }

    public static void resultGame(int random) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int player = sc.nextInt();

            if (player == random) {
                System.out.println("Успех");
                break;
            } else if (player < random) {
                System.out.println("Горячо");
            } else
                System.out.println("Холодно");
        }

    }

}