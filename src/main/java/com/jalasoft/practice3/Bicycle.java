package com.jalasoft.practice3;

public class Bicycle extends Land {
    private final boolean exerciseBike;

    public Bicycle(final String name, final int price, final boolean hasMotor, final boolean exerciseBike) {
        super(name, price, hasMotor);
        this.exerciseBike = exerciseBike;
    }

    @Override
    public String displayData() {
        return String.format("name = %s, price = %s, hasMotor = %s, exercise = %s",
                getName(), getPrice(), isHasMotor(), this.exerciseBike);
    }
}
