package br.com.douggo.builder.traditional.director;

import br.com.cod3r_base.builder.meal.model.FastFoodMeal;
import br.com.douggo.builder.traditional.builder.FastFoodMealBuilder;

public class MealDirector {

    private final FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public FastFoodMeal createCombo() {
        this.builder.buildMain();
        this.builder.buildSide();
        this.builder.buildDrink();
        this.builder.buildDesert();
        this.builder.buildGift();
        return this.builder.getMeal();
    }

}
