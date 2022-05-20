package com.nevo;
import com.nevo.Coffee.Coffee;
import com.nevo.enums.*;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee.CoffeeBuilder(ECoffeeDrinkType.AMERICANO)
                .setWithSize(ECoffeeCupSize.SMALL)
                .setWithDrinkLevel(ECoffeeDrinkLevel.HEAVY)
                .setWithMachineType(ECoffeeMachineType.SEMI_MACHINE).build();
        coffee.makeCoffee();
    }

}