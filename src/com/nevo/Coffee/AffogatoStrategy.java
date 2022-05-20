package com.nevo.Coffee;
import Utils.CoffeeUtils;
import com.nevo.enums.ECommonIngredients;

public class AffogatoStrategy implements ICoffeeInitializer {

    @Override
    public void process(Recipe recipe) {
        recipe.addIngredient(new Ingredient(
                ECommonIngredients.SUGAR, "1 tablespoon"));
        recipe.addIngredient(new Ingredient(ECommonIngredients.ICE_CREAM, "1 cup"));
        CoffeeUtils.mixIt(recipe);
    }



}
