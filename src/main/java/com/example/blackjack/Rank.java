package com.example.blackjack;

public enum Rank {
    ACE(1, "A"), TWO(2, "2"), THREE(3, "3"),
    FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"),
    SEVEN(7, "7"), EIGHT(8, "8"),
    NINE(9, "9"), TEN(10, "10"),
    JACK(10, "J"), QUEEN(10, "Q"), KING(10, "K");

    private final int value;
    private final String shortLabel;

    Rank(int value, String shortLabel) {
        this.value = value;
        this.shortLabel = shortLabel;
    }

    //Exercise 1.8
    public static Rank parseRank(String text) {
        if(text == null) {
            return null;
        }
        text = text.strip().toUpperCase();
        Rank result = null;
        for(Rank rank : Rank.values()) {
            if(rank.name().equals(text)) {
                result = rank;
            }
        }
        return result;
    }

    public int getValue() {
        return value;
    }

    public String getShortLabel() {
        return shortLabel;
    }

}
