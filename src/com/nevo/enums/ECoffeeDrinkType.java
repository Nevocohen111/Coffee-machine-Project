package com.nevo.enums;
import com.nevo.Coffee.*;

public enum ECoffeeDrinkType {
    LATTE( new LatteStrategy()),
    AFFOGATO( new AffogatoStrategy()),
    MOCHA( new MochaStrategy()),
    AMERICANO( new AmericanoStrategy());

    private final ICoffeeInitializer coffeeInitializer;

    ECoffeeDrinkType(ICoffeeInitializer coffeeInitializer) {
        this.coffeeInitializer = coffeeInitializer;
    }

    public ICoffeeInitializer getCoffeeInitializer() {
        return coffeeInitializer;
    }
}
