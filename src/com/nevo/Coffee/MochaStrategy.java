package com.nevo.Coffee;
import Utils.CoffeeUtils;
import com.nevo.enums.ECommonIngredients;

public class MochaStrategy implements ICoffeeInitializer{
    @Override
    public void process(Recipe recipe) {
        recipe.addIngredient(new Ingredient(
                ECommonIngredients.MILK, "200ml"));
        recipe.addIngredient(new Ingredient(ECommonIngredients.WATER, "100ml"));
        recipe.addIngredient(new Ingredient(ECommonIngredients.CHOCOLATE, "5gr"));
        recipe.addIngredient(new Ingredient(ECommonIngredients.ICE_CREAM, "7gr"));
        CoffeeUtils.mixIt(recipe);
    }
}
