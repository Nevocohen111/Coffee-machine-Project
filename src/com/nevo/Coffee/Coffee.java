package com.nevo.Coffee;
import Utils.CoffeeUtils;
import com.nevo.enums.*;

public class Coffee  {
   private final ECoffeeCupSize size;
   private final ECoffeeDrinkLevel drinkLevel;
   private final ECoffeeDrinkType drinkType;
   private final ECoffeeMachineType machineType;
   private final Recipe recipe;


   public Coffee(ECoffeeDrinkType drinkType, ECoffeeCupSize size, ECoffeeDrinkLevel drinkLevel, ECoffeeMachineType machineType) {
       this.size = size;
       this.drinkLevel = drinkLevel;
       this.machineType = machineType;
       this.drinkType = drinkType;
       this.recipe = new Recipe();
   }


    public Recipe getRecipe() {
        return recipe;
    }


    public ECoffeeCupSize getSize() {
        return size;
    }

    public ECoffeeDrinkLevel getDrinkLevel() {
        return drinkLevel;
    }

    public ECoffeeDrinkType getDrinkType() {
        return drinkType;
    }


    public ECoffeeMachineType getMachineType() {
        return machineType;
    }




    public static class CoffeeBuilder{
        private ECoffeeCupSize withSize;
        private ECoffeeDrinkLevel withDrinkLevel;
        private final ECoffeeDrinkType withDrinkType;
        private ECoffeeMachineType withMachineType;

        public CoffeeBuilder(ECoffeeDrinkType drinkType) {
            this.withDrinkType = drinkType;
        }

        public CoffeeBuilder setWithSize(ECoffeeCupSize size){
            this.withSize = size;
            return this;
        }

        public CoffeeBuilder setWithDrinkLevel(ECoffeeDrinkLevel drinkLevel){
            this.withDrinkLevel = drinkLevel;
            return this;
        }

        public CoffeeBuilder setWithMachineType(ECoffeeMachineType machineType){
            this.withMachineType = machineType;
            return this;
        }

        public Coffee build(){
            return new Coffee(withDrinkType, withSize, withDrinkLevel, withMachineType);
        }
    }

    public void makeCoffee(){
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.setCoffeeStrategy(this.getDrinkType().getCoffeeInitializer());
        coffeeMaker.makeCoffee(this);
        CoffeeUtils.price(this,getRecipe());


    }
}
