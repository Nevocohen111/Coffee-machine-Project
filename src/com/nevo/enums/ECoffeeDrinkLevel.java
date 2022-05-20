package com.nevo.enums;

public enum ECoffeeDrinkLevel {
    LIGHT("Light",1),
    MEDIUM("Medium",2),
    HEAVY("Heavy",3);

    private final String Strength;
    private final int price;

     ECoffeeDrinkLevel(String Strength, int price) {
          this.price = price;
          this.Strength = Strength;
    }

    public int getPrice() {
        return price;
    }
    public String getStrength() {
        return Strength;
    }

}
