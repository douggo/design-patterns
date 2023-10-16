package br.com.douggo.decorator.coffeeShop.model;

import br.com.douggo.decorator.coffeeShop.model.decorators.DrinkDecorator;

public class DoubleDrink extends DrinkDecorator {

    public DoubleDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        drink.serve();
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() * 2;
    }
}