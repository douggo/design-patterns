package br.com.douggo.builder.useCase.spolleto.functional;

import br.com.douggo.builder.useCase.spolleto.fluent.models.Size;
import br.com.douggo.builder.useCase.spolleto.functional.model.Pasta;

import java.util.Arrays;
import java.util.Collections;

public class Client {

    public static void main(String[] args) {
        Pasta pasta = new Pasta.Builder(Arrays.asList("Bacon", "Tomato"))
                .sauces(Collections.singletonList("BBQ"))
                .size(Size.LARGE)
                .cheese(true)
                .pepper(true)
                .build();
        System.out.println("Eu pedi: " + pasta);
    }

}
