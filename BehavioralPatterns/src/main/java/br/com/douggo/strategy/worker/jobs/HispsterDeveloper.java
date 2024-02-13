package br.com.douggo.strategy.worker.jobs;

import br.com.douggo.strategy.worker.strategies.eat.VeggieDiet;
import br.com.douggo.strategy.worker.strategies.transportation.BikeTransportation;
import br.com.douggo.strategy.worker.strategies.work.DeveloperWork;

public class HispsterDeveloper implements Worker {

	@Override
	public void eat() {
		new VeggieDiet().eat();
	}

	@Override
	public void move() {
		new BikeTransportation().move();
	}

	@Override
	public void work() {
		new DeveloperWork().work();
	}

}
