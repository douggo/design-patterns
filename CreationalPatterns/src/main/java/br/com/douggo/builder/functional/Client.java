package br.com.douggo.builder.functional;

import br.com.douggo.builder.functional.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {
        orderFastFoodMeal();
    }

    private static void orderFastFoodMeal() {
        FastFoodMeal food = new FastFoodMeal.Builder("Large Fries")
                .drink("Coke")
                .main("Double Cheeseburger")
                .dessert("Fudge Cake ")
                .gift("Mario")
                .build();
        System.out.println("I ordered: " + food);
    }

}
