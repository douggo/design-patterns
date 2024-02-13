package br.com.douggo.strategy.person.strategies.work;

public class PilotWork implements WorkStrategy {

    @Override
    public void work() {
        System.out.println("I fly planes for a living!");
    }
}
