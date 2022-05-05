package com.company;

public class Nissan extends Car {
    private double volume;

    public Nissan(ColorEnum color, double volume) {
        super(color);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void print() {
        System.out.println( "Nissan's color: " + getColor() +
                "\n Nissan's volume: " + getVolume());
    }
}
