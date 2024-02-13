package br.com.douggo.strategy.person;

import br.com.douggo.strategy.person.strategies.eat.CarnivoreDiet;
import br.com.douggo.strategy.person.strategies.eat.VeggieDiet;
import br.com.douggo.strategy.person.strategies.transportation.BikeTransportation;
import br.com.douggo.strategy.person.strategies.transportation.CarTransportation;
import br.com.douggo.strategy.person.strategies.transportation.MotorcycleTransportation;
import br.com.douggo.strategy.person.strategies.work.DeveloperWork;
import br.com.douggo.strategy.person.strategies.work.PilotWork;

public class Client {

	public static void presentYourself(Person person) {
		System.out.println("Hi, I'm " + person.getFullName());
		person.eat();
		person.move();
		person.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Person john = new Person("John", new CarnivoreDiet(), new BikeTransportation(), new DeveloperWork());
		presentYourself(john);

		Person ann = new Person("Ann", new VeggieDiet(), new MotorcycleTransportation(), new DeveloperWork());
		presentYourself(ann);

		Person carol = new Person("Carol", new CarnivoreDiet(), new CarTransportation(), new PilotWork());
		presentYourself(carol);
	}
}
