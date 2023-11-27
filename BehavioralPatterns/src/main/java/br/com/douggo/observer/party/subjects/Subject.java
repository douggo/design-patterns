package br.com.douggo.observer.party.subjects;

import br.com.douggo.observer.party.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    protected List<Observer> observers;

    abstract public void notifyObservers();

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

}
