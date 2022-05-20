package com.nevo.Coffee;

import com.nevo.enums.ECoffeeCupSize;
import com.nevo.enums.ECommonIngredients;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    protected List<Ingredient> commonIngredients;




    public Recipe() {
        this.commonIngredients = new ArrayList<>();
        setCommonIngredients();
    }

    public void setCommonIngredients() {
        commonIngredients.add(new Ingredient(ECommonIngredients.BEANS,"15gr"));
    }

    public List<Ingredient> getCommonIngredients() {
        return commonIngredients;
    }

    public void addIngredient(Ingredient ingredient) {
        commonIngredients.add(ingredient);
    }

}
