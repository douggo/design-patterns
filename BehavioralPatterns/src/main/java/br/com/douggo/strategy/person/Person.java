package br.com.douggo.strategy.person;

import br.com.douggo.strategy.person.strategies.transportation.TransportationStrategy;
import br.com.douggo.strategy.person.strategies.work.WorkStrategy;
import br.com.douggo.strategy.person.strategies.eat.EatStrategy;

public class Person {

    private final String fullName;

    private final EatStrategy eatStrategy;
    private final TransportationStrategy transportationStrategy;
    private final WorkStrategy workStrategy;

    public Person(String fullName, EatStrategy eatStrategy, TransportationStrategy transportationStrategy, WorkStrategy workStrategy) {
        this.fullName = fullName;
        this.eatStrategy = eatStrategy;
        this.transportationStrategy = transportationStrategy;
        this.workStrategy = workStrategy;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void eat() {
        this.eatStrategy.eat();
    }

    public void move() {
        this.transportationStrategy.move();
    }

    public void work() {
        this.workStrategy.work();
    }

}
