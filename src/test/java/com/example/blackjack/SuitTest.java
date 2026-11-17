package com.example.blackjack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testPrintHeart() {
        assertEquals("\u2665", Suit.HEARTS.toString());
    }

    //Exercise 1.3
    @Test
    void testGetColor() {
        Suit suit;
        suit = Suit.DIAMONDS;
        assertEquals("red", suit.getColor());
        suit = Suit.HEARTS;
        assertEquals("red", suit.getColor());
        suit = Suit.CLUBS;
        assertEquals("black", suit.getColor());
        suit = Suit.SPADES;
        assertEquals("black", suit.getColor());
    }
}