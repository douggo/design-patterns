package br.com.douggo.builder.traditional;

import br.com.cod3r_base.builder.meal.model.FastFoodMeal;
import br.com.douggo.builder.traditional.builder.FullMealBuilder;
import br.com.douggo.builder.traditional.director.MealDirector;

public class Client {

	public static void main(String[] args) {
		System.out.println("Creating a full meal course:");
		FastFoodMeal meal = new FastFoodMeal();
		MealDirector director = new MealDirector(new FullMealBuilder(meal));
		FastFoodMeal combo = director.createCombo();
		System.out.println(combo);
	}
}