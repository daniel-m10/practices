package com.jalasoft.practice3;

public abstract class Land extends Transport {
    private final boolean hasMotor;

    public Land(final String name, final int price, final boolean hasMotor) {
        super(name, price);
        this.hasMotor = hasMotor;
    }

    public abstract String displayData();

    public boolean isHasMotor() {
        return this.hasMotor;
    }
}
