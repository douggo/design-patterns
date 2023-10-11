package br.com.douggo.builder.useCase.spolleto.after.model.builders;

import br.com.douggo.builder.useCase.spolleto.after.model.Pasta;

public class PastaBuilder extends MealBuilderOpt {

    public Pasta build() {
        return new Pasta(this.toppings, this.sauces, this.size, this.cheese, this.pepper);
    }

}
