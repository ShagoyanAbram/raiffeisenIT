package com.abram.game;

import java.util.Scanner;

public class HotCold {

    public static int randomNumber(final int max) {
        return (int) (Math.random() * max);
    }

    public static void resultGame(int random) {
        int a = 0;
        int b;

        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        if (player == random) {
            System.out.println("Успех");
            return;
        }
        a++;
        b = player;

        while (a >= 1) {
            player = sc.nextInt();
            if (player == random) {
                System.out.println("Успех");
                break;
            } else if (Math.abs(random - b) > Math.abs(random - player)) {
                System.out.println("Горячо");
            } else {
                System.out.println("Холодно");
            }
            b = player;
        }
    }
}