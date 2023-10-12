package br.com.douggo.prototype.animation.model;

import java.util.HashMap;
import java.util.Map;

public class PersonSamples {

    private final Map<String, Person> samples;

    public PersonSamples() {
        this.samples = new HashMap<>();
        this.loadSamples();
    }

    private void loadSamples() {
        this.samples.put("stickMan", new Person(
                "                   ",
                "        o          ",
                "       /|\\          ",
                "_______/_\\___________"
        ));
        this.samples.put("fatMan", new Person(
                "                   ",
                "       (^ ^)          ",
                "       <)  )\\         ",
                "_______/__\\___________"
        ));
    }

    public Person getPersonSample(String type) {
        return this.samples.get(type);
    }

}
