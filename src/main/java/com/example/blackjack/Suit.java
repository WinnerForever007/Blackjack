package com.example.blackjack;

public enum Suit {
    CLUBS('\u2663', "black"),
    DIAMONDS('\u2666', "red"),
    HEARTS('\u2665', "red"),
    SPADES('\u2660', "black");

    private final char symbol;
    private final String color;

    Suit(char symbol, String color) {
        this.symbol = symbol;
        this.color = color;
    }

    @Override
    public String toString() {
        return Character.toString(symbol);
    }

    //Exercise 1.3
    public String getColor() {
        return color;
    }
}
