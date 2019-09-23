package com.abram.homework.array.poker;

public class Poker {
    private static final int SIZE = 54;

    public static String[] createDeck() {
        String[] cardDeck = new String[SIZE];
        int index = 0;
        while (index < 32) {
            for (int i = 2; i <= 10; i++) {
                cardDeck[index] = i + "♥";
                index++;
                cardDeck[index] = i + "♦";
                index++;
                cardDeck[index] = i + "♠";
                index++;
                cardDeck[index] = i + "♣";
                index++;
            }
            index++;
        }
        cardDeck[36] = "В♥";
        cardDeck[37] = "В♦";
        cardDeck[38] = "В♠";
        cardDeck[39] = "В♣";
        cardDeck[40] = "Д♥";
        cardDeck[41] = "Д♦";
        cardDeck[42] = "Д♠";
        cardDeck[43] = "Д♣";
        cardDeck[44] = "К♥";
        cardDeck[45] = "К♦";
        cardDeck[46] = "К♠";
        cardDeck[47] = "К♣";
        cardDeck[48] = "Т♥";
        cardDeck[49] = "T♦";
        cardDeck[50] = "T♠";
        cardDeck[51] = "T♣";
        cardDeck[52] = "J_Black";
        cardDeck[53] = "J_Red";
        return cardDeck;
    }
}
