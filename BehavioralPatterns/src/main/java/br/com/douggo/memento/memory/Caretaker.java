package br.com.douggo.memento.memory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Caretaker {

    private List<Memento> mementos = new ArrayList<>();

    public List<Memento> getHistoryList() {
        return Collections.unmodifiableList(this.mementos);
    }

    public void add(Memento memento) {
        this.mementos.add(memento);
    }

    public Memento get(int index) {
        return this.mementos.get(index);
    }

}
