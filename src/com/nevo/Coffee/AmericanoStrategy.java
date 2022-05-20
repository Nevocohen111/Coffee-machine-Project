package com.nevo.Coffee;
import Utils.CoffeeUtils;
import com.nevo.enums.ECommonIngredients;

public class AmericanoStrategy implements ICoffeeInitializer {

    @Override
    public void process(Recipe recipe) {
        recipe.addIngredient(new Ingredient(
                ECommonIngredients.WATER, "200ml"));
        CoffeeUtils.mixIt(recipe);
    }

}
