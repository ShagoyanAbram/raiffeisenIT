package com.abram.homework.array.poker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите количество игроков: ");
            int countPlayer = sc.nextInt();
            if (countPlayer == -1) {
                break;
            }
            String[] deck = Poker.createDeck();
            String[] strings = Croupier.sortDeck(deck);
            Croupier.pokerStart(countPlayer, strings);
        }
    }

    public static void print(String[] str) {
        for (String s : str) System.out.println(s);
    }
}
