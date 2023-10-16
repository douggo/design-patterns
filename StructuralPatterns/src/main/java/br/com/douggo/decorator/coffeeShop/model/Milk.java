package br.com.douggo.decorator.coffeeShop.model;

import br.com.douggo.decorator.coffeeShop.model.decorators.DrinkDecorator;

public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("- Adding 30ml of milk");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() * 1.25;
    }
}
