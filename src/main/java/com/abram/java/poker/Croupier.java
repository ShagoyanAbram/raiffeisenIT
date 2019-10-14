package com.abram.java.poker;

import java.util.Random;

public class Croupier {
    private static Random random = new Random();

    public static String[] sortDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = random.nextInt(deck.length);
            String buf = deck[i];
            deck[i] = deck[index];
            deck[index] = buf;
        }
        return deck;
    }

    public static void pokerStart(int player, String[] deck) {
        if (player <= 9) {
            for (int i = 0; i < player; i++) {
                System.out.println("Player: " + (i + 1));
                for (int j = i * 5; j < i * 5 + 5; j++) {
                    System.out.print(deck[j] + "  ");
                }
                System.out.println("\n");
            }
        }else {
            System.out.println("Превышено количество игроков");
        }
    }
}
