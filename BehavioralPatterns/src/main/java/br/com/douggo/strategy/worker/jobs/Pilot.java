package br.com.douggo.strategy.worker.jobs;

import br.com.douggo.strategy.worker.strategies.eat.CarnivoreDiet;
import br.com.douggo.strategy.worker.strategies.transportation.MotorcycleTransportation;
import br.com.douggo.strategy.worker.strategies.work.PilotWork;

public class Pilot implements Worker {

	@Override
	public void eat() {
		new CarnivoreDiet().eat();
	}

	@Override
	public void move() {
		new MotorcycleTransportation().move();
	}

	@Override
	public void work() {
		new PilotWork().work();
	}

}
