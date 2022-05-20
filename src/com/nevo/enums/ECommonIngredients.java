package com.nevo.enums;

public enum ECommonIngredients {
    BEANS("beans",1.5),
    WATER("water",1.25),
    MILK("milk",1.6),
    SUGAR("sugar",0.5),
    CHOCOLATE("chocolate",0.2),
    ICE_CREAM("ice cream",2),
    CINNAMON("cinnamon",1.8);

    private final String name;
    private double price;

    private ECommonIngredients(String name, double price) {
        this.price = price;
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
