package br.com.douggo.decorator.coffeeShop;

import br.com.douggo.decorator.coffeeShop.model.*;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println("R$ " + drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		order("Lungo", new DoubleDrink(new Expresso()));
		order("Cafe Au Lait", new Milk(new Expresso()));
		order("English Tea", new Milk(new Tea()));
		order("Double English Tea", new DoubleDrink(new Milk(new Tea())));
		order("English Tea w/ Double Tea", new Milk(new DoubleDrink(new Tea())));
	}
}
