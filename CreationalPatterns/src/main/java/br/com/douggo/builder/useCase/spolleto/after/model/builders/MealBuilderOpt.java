package br.com.douggo.builder.useCase.spolleto.after.model.builders;

import br.com.douggo.builder.useCase.spolleto.after.model.Size;

import java.util.List;

public abstract class MealBuilderOpt {

    protected Size size;
    protected List<String> toppings;
    protected List<String> sauces;
    protected boolean cheese;
    protected boolean pepper;

    public void setSize(Size size) {
        this.size = size;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setPepper(boolean pepper) {
        this.pepper = pepper;
    }
}
