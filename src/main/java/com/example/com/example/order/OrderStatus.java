package com.example.com.example.order;

//Exercise 1.10
public enum OrderStatus {
    PENDING("The order is under review"), SHIPPED("The order has been sent"),
    DELIVERED("The order has been delivered"), CANCELLED("The order has been cancelled");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
