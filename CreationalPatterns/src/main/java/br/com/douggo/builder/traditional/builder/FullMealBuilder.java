package br.com.douggo.builder.traditional.builder;

import br.com.cod3r_base.builder.meal.model.FastFoodMeal;

public class FullMealBuilder extends FastFoodMealBuilder {

    public FullMealBuilder(FastFoodMeal meal) {
        super(meal);
    }

    @Override
    public void buildMain() {
        this.meal.setMain("Quarter Cheese");
    }

    @Override
    public void buildSide() {
        this.meal.setSide("Gigantic Fries");
    }

    @Override
    public void buildDrink() {
        this.meal.setDrink("Sprite 600ml");
    }

    @Override
    public void buildDesert() {
        this.meal.setDessert("Brownies");
    }

    @Override
    public void buildGift() {
        this.meal.setToy("Super Mario Guy");
    }

}
