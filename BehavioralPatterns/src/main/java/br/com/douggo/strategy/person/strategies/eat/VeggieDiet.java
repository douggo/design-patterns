package br.com.douggo.strategy.person.strategies.eat;

public class VeggieDiet implements EatStrategy {

    @Override
    public void eat() {
        System.out.println("I eat only vegetables!");
    }
}
