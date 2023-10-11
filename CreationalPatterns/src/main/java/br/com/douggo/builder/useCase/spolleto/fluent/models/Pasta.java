package br.com.douggo.builder.useCase.spolleto.fluent.models;

import java.util.List;

public class Pasta {

    private final List<String> toppings;
    private final List<String> sauces;
    private final Size size;
    private final boolean cheese;
    private final boolean pepper;

    public Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
        this.toppings = toppings;
        this.sauces = sauces;
        this.size = size;
        this.cheese = cheese;
        this.pepper = pepper;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public Size getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepper() {
        return pepper;
    }

    @Override
    public String toString() {
        return "Pasta{" +
                "toppings=" + toppings +
                ", sauces=" + sauces +
                ", size=" + size +
                ", cheese=" + cheese +
                ", pepper=" + pepper +
                '}';
    }
}
