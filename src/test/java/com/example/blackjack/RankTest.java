package com.example.blackjack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getValueOfKing() {
        assertEquals(10, Rank.KING.getValue());
    }

    //Exercise 1.8
    @Test
    void testParseRank() {
        assertEquals(Rank.QUEEN, Rank.parseRank("queen"));
        assertNull(Rank.parseRank("fggr"));
        assertNull(Rank.parseRank(null));
    }

    //Exercise 1.9
    @Test
    void testEqualsOfTwoEnums() {
        assertSame(Rank.KING, Rank.valueOf("KING"));
    }

}