package br.com.douggo.decorator.coffeeShop.model.decorators;

import br.com.douggo.decorator.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {

    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }
	
}