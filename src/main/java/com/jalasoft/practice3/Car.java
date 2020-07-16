package com.jalasoft.practice3;

public class Car extends Land {
    private final boolean useGas;

    public Car(final String name, final int price, final boolean hasMotor, final boolean useGas) {
        super(name, price, hasMotor);
        this.useGas = useGas;
    }

    @Override
    public String displayData() {
        return String.format("name = %s, price = %s, hasMotor = %s, useGas = %s",
                getName(), getPrice(), isHasMotor(), this.useGas);
    }
}
