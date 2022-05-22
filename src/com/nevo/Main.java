package com.nevo;
import com.nevo.Coffee.Coffee;
import com.nevo.enums.*;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee.CoffeeBuilder(ECoffeeDrinkType.AFFOGATO).build();
        coffee.makeCoffee();
    }

}