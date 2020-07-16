package com.jalasoft.practice3;

public abstract class Transport {
    private final String name;
    private final int price;

    public Transport(final String name, final int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
