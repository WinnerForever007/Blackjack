package com.example.direction;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    //Exercise 1.1
    @Test
    void testPrintValues() {
        for (Direction direction : Direction.values()) {
            System.out.println(direction + " " + direction.ordinal());
        }
        assertEquals(0, Direction.NORTH.ordinal());
        assertArrayEquals(new Direction[]{Direction.NORTH, Direction.EAST,
                Direction.SOUTH, Direction.WEST}, Direction.values());
    }

    //Exercise 1.2
    @Test
    void testOppositeDirectionForWest() {
        Direction dir = Direction.valueOf("WEST");
        assertEquals(Direction.EAST, dir.opposite());
    }

    @Test
    void testOppositeDirectionForNorth() {
        Direction dir = Direction.valueOf("NORTH");
        assertEquals(Direction.SOUTH, dir.opposite());
    }

    @Test
    void testOppositeDirectionForEast() {
        Direction dir = Direction.valueOf("EAST");
        assertEquals(Direction.WEST, dir.opposite());
    }

    @Test
    void testOppositeDirectionForSouth() {
        Direction dir = Direction.valueOf("SOUTH");
        assertEquals(Direction.NORTH, dir.opposite());
    }
}