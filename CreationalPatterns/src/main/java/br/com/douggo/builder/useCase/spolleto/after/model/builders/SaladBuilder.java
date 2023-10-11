package br.com.douggo.builder.useCase.spolleto.after.model.builders;

import br.com.douggo.builder.useCase.spolleto.after.model.Salad;

public class SaladBuilder extends MealBuilderOpt {

    public Salad build() {
        return new Salad(this.toppings, this.sauces, this.size, this.cheese, this.pepper);
    }

}
