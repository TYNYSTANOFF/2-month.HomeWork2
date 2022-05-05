package com.company;

public class Mitsubishi extends  Car{
    private int mileage;

    public Mitsubishi(ColorEnum color, int mileage) {
        super(color);
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public void print() {
        System.out.println( "Mitsubishi's color: " + getColor() +
                "\n Mitsubishi's volume: " + getMileage());
    }
}
