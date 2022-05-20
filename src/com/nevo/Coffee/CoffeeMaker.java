package com.nevo.Coffee;
import Utils.CoffeeUtils;

public class CoffeeMaker {
    ICoffeeInitializer coffeeInitializer;

   public CoffeeMaker setCoffeeStrategy(ICoffeeInitializer coffeeInitializer) {
        this.coffeeInitializer = coffeeInitializer;
        return this;
    }

    public void makeCoffee(Coffee coffee) {
        CoffeeUtils.printOrderCoffee(coffee);
        coffeeInitializer.process(coffee.getRecipe());
    }

}
