package com.company;

public class Main {

    public static void main(String[] args) {
        Prinable[] print = {createObject("1object"),
                createObject("2object"),
                createObject("3object")};

        for (Prinable prinable : print) {
            prinable.print();
        }
    }


    public static Prinable createObject(String className) {
        switch (className) {
            case "1object":
                Nissan nissan = new Nissan(ColorEnum.BLACK, 2.6);
                return nissan;
            case "2object":
                Mazda mazda = new Mazda(ColorEnum.PINK, 2014);
                return mazda;
            case "3object":
                Mitsubishi mitsubishi = new Mitsubishi(ColorEnum.BLUE, 130000);
                return mitsubishi;
        }
        return null;

    }
}
