package br.com.douggo.builder.traditional.builder;

import br.com.cod3r_base.builder.meal.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {

    protected FastFoodMeal meal;

    public FastFoodMealBuilder(FastFoodMeal meal) { this.meal = meal; }

    public FastFoodMeal getMeal() { return this.meal; }

    public abstract void buildMain();

    public abstract void buildSide();

    public abstract void buildDrink();

    public abstract void buildDesert();

    public abstract void buildGift();

}
