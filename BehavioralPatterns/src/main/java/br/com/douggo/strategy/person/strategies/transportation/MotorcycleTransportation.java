package br.com.douggo.strategy.person.strategies.transportation;

public class MotorcycleTransportation implements TransportationStrategy {

    @Override
    public void move() {
        System.out.println("I use a motorcycle to drive around!");
    }
}
