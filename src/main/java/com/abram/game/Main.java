package com.abram.game;

public class Main {
    public static void main(String[] args) {
        int saveNumber = HotCold.randomNumber(15);
        HotCold.resultGame(saveNumber);
    }
}