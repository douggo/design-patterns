package br.com.douggo.strategy.worker.strategies.work;

public class PilotWork implements WorkStrategy {

    @Override
    public void work() {
        System.out.println("I fly planes for a living!");
    }
}
