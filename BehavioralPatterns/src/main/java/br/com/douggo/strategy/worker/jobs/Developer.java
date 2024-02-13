package br.com.douggo.strategy.worker.jobs;

import br.com.douggo.strategy.worker.strategies.eat.CarnivoreDiet;
import br.com.douggo.strategy.worker.strategies.transportation.CarTransportation;
import br.com.douggo.strategy.worker.strategies.work.DeveloperWork;

public class Developer implements Worker {

	@Override
	public void eat() {
		new CarnivoreDiet().eat();
	}

	@Override
	public void move() {
		new CarTransportation().move();
	}

	@Override
	public void work() {
		new DeveloperWork().work();
	}

}
