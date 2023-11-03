package br.com.douggo.mediator.swing.components;

import br.com.douggo.mediator.swing.mediator.Mediator;

public class State {

    private int counter;
    private final Mediator mediator;

    public State(Mediator mediator) {
        this.mediator = mediator;
        this.counter = 0;
    }

    public void addCount() {
        this.counter++;
        if (this.counter == 10) {
            this.mediator.stop();
        }
    }

    public int getCounter() {
        return this.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
