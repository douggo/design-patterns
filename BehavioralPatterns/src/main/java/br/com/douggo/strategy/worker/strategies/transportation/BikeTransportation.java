package br.com.douggo.strategy.worker.strategies.transportation;

public class BikeTransportation implements TransportationStrategy {
    @Override
    public void move() {
        System.out.println("I use a bike to move around!");
    }

}
