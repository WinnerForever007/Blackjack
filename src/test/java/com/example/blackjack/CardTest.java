package com.example.blackjack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void canGetValueOfTwoCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.TWO);
        assertEquals(2, card1.getValue());
    }

    @Test
    void canGetValueOfThreeCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.THREE);
        assertEquals(3, card1.getValue());
    }

    @Test
    void canGetValueOfAceCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.ACE);
        assertEquals(1, card1.getValue());
    }

    @Test
    void canGetValueOfJackCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.JACK);
        assertEquals(10, card1.getValue());
    }

    //Exercise 1.4
    @Test
    void testToString() {
        Card card1 = new Card(Suit.HEARTS, Rank.EIGHT);
        assertEquals("8\u2665", card1.toString());
    }

    //Exercise 1.6
    @Test
    void testPrintFullDeck() {
        int count = 0;
        for(Suit suit : Suit.values()) {
            for(Rank rank : Rank.values()) {
                System.out.print(new Card(suit, rank) + " ");
                count++;
            }
            System.out.println();
        }
        assertEquals(52, count);
    }

    //Exercise 1.7
    @Test
    void testValuesOfFullDeck() {
        int value = 0;
        for(Suit suit : Suit.values()) {
            for(Rank rank : Rank.values()) {
                value += rank.getValue();
            }
        }
        assertEquals(340, value);
    }


}