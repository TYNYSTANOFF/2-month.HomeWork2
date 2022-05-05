package com.company;

public abstract class Car implements Prinable {
    private ColorEnum color;

    public Car(ColorEnum color) {
        this.color = color;
    }

    public ColorEnum getColor() {
        return color;
    }
}
