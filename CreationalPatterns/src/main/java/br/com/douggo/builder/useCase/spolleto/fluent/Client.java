package br.com.douggo.builder.useCase.spolleto.fluent;

import br.com.douggo.builder.useCase.spolleto.fluent.models.PastaBuilder;
import br.com.douggo.builder.useCase.spolleto.fluent.models.Size;

import java.util.Arrays;
import java.util.Collections;

public class Client {

    public static void main(String[] args) {
        PastaBuilder pastaBuilder = new PastaBuilder(true, true);
        System.out.println("Eu pedi: " + pastaBuilder.setSize(Size.LARGE)
                .setToppings(Arrays.asList("Bacon", "Crumble Bread"))
                .setSauces(Collections.singletonList("Rosê"))
                .build());
    }

}
