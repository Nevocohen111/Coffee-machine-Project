package com.nevo.enums;

public enum ECoffeeCupSize {
    SMALL("Small",0.25),
    MEDIUM("Medium",0.5),
    LARGE("Large",1.0);

    private final double price;
    private final String size;
    private ECoffeeCupSize(String size, double price) {
        this.price = price;
        this.size = size;
    }
    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }
}


