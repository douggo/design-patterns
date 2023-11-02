package br.com.douggo.mediator.swing.components;

public class State {

    private int counter;

    public State() {
        this.counter = 0;
    }

    public void addCount() {
        this.counter++;
    }

    public int getCounter() {
        return this.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
