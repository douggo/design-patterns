package br.com.douggo.strategy.worker.strategies.eat;

public class CarnivoreDiet implements EatStrategy {
    @Override
    public void eat() {
        System.out.println("I eat meat!");
    }
}
