package br.com.douggo.builder.useCase.spolleto.functional.model;

import br.com.douggo.builder.useCase.spolleto.fluent.models.Size;

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

    public static class Builder {

        private final List<String> toppings;
        private List<String> sauces;
        private Size size;
        private boolean cheese;
        private boolean pepper;

        public Builder(List<String> toppings) {
            this.toppings = toppings;
        }

        public Builder sauces(List<String> sauces) {
            this.sauces = sauces;
            return this;
        }

        public Builder size(Size size) {
            this.size = size;
            return this;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder pepper(boolean pepper) {
            this.pepper = pepper;
            return this;
        }

        public Pasta build() {
            return new Pasta(this.toppings, this.sauces, this.size, this.cheese, this.pepper);
        }

    }
}
