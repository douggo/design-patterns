package br.com.douggo.strategy.person.strategies.work;

public class DeveloperWork implements WorkStrategy {

    @Override
    public void work() {
        System.out.println("I code to earn a living!");
    }
}
