package com.nevo.enums;

public enum ECoffeeMachineType {

    MANUAL_MACHINE("Manual Machine",1.45),
    AUTOMATIC_MACHINE("Automatic Machine",2.25),
    SEMI_MACHINE("Semi-automatic Machine",1.75);

    private final String coffeeMachineType;
    private final double liquidCost;

    ECoffeeMachineType(String coffeeMachineType, double liquidCost) {
        this.liquidCost = liquidCost;
        this.coffeeMachineType = coffeeMachineType;
    }

    public double getLiquidCost() {
        return liquidCost;
    }

    public String getCoffeeMachineType() {
        return coffeeMachineType;
    }
}
