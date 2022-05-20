package com.nevo.Coffee;

import com.nevo.enums.ECommonIngredients;

public class Ingredient {
    private ECommonIngredients name;
    private String quantity;

    public Ingredient(ECommonIngredients name, String quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public ECommonIngredients getName() {
        return name;
    }

    public double getPrice() {
        return name.getPrice();
    }

    public String getQuantity() {
        return quantity;
    }
}
