package com.example.com.example.order;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderStatusTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    //Exercise 1.10
    @Test
    void testToStringOrder() {
        assertEquals("The order is under review", OrderStatus.PENDING.toString());
    }


}