package br.com.douggo.strategy.person.strategies.transportation;

public class CarTransportation implements TransportationStrategy {

    @Override
    public void move() {
        System.out.println("I move around with a car!");
    }
}
