package com.company;

public class Mazda extends Car{
    private int year;

    public Mazda(ColorEnum color, int year) {
        super(color);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void print() {
        System.out.println( "Mazda's color: " + getColor() +
                "\n Mazda's volume: " + getYear());
    }
}
