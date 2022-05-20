package com.nevo.Coffee;
import Utils.CoffeeUtils;
import com.nevo.enums.ECommonIngredients;

public class LatteStrategy implements ICoffeeInitializer {

    @Override
    public void process(Recipe recipe) {
        recipe.addIngredient(new Ingredient(
                ECommonIngredients.MILK, "200ml"));
        recipe.addIngredient(new Ingredient(ECommonIngredients.WATER, "100ml"));
        recipe.addIngredient(new Ingredient(ECommonIngredients.CINNAMON, "10gr"));
        CoffeeUtils.mixIt(recipe);
    }
}
