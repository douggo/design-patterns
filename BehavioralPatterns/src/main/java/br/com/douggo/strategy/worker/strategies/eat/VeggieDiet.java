package br.com.douggo.strategy.worker.strategies.eat;

public class VeggieDiet implements EatStrategy {

    @Override
    public void eat() {
        System.out.println("I eat only vegetables!");
    }
}
