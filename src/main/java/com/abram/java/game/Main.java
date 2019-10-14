package com.abram.java.game;

public class Main {
    public static void main(String[] args) {
        int saveNumber = HotCold.randomNumber(15);
        System.out.println(saveNumber);
        HotCold.resultGame(saveNumber);
    }
}