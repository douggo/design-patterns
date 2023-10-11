package br.com.douggo.builder.useCase.spolleto.fluent.models;

import java.util.List;

public class PastaBuilder {

    private List<String> toppings;
    private List<String> sauces;
    private Size size;
    private boolean cheese;
    private boolean pepper;

    public PastaBuilder(boolean cheese, boolean pepper) {
        this.cheese = cheese;
        this.pepper = pepper;
    }

    public PastaBuilder setToppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    public PastaBuilder setSauces(List<String> sauces) {
        this.sauces = sauces;
        return this;
    }

    public PastaBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public Pasta build() {
        return new Pasta(this.toppings, this.sauces, this.size, this.cheese, this.pepper);
    }

}
