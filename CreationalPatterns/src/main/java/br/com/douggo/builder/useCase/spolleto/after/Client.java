package br.com.douggo.builder.useCase.spolleto.after;

import br.com.douggo.builder.useCase.spolleto.after.model.Pasta;
import br.com.douggo.builder.useCase.spolleto.after.model.Salad;
import br.com.douggo.builder.useCase.spolleto.after.model.Size;
import br.com.douggo.builder.useCase.spolleto.after.model.builders.PastaBuilder;
import br.com.douggo.builder.useCase.spolleto.after.model.builders.SaladBuilder;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        PastaBuilder pastaBuilder = new PastaBuilder();
        pastaBuilder.setToppings(Arrays.asList("Bacon", "Tomate", "Alface"));
        pastaBuilder.setSauces(Arrays.asList("Molho Branco", "Molho Rosê"));
        pastaBuilder.setSize(Size.LARGE);
        pastaBuilder.setCheese(true);
        pastaBuilder.setPepper(false);
        Pasta pasta = pastaBuilder.build();
        System.out.println("Eu pedi: " + pasta);

        SaladBuilder saladBuilder = new SaladBuilder();
        saladBuilder.setToppings(Arrays.asList("Bacon", "Alface"));
        saladBuilder.setSize(Size.STANDARD);
        Salad salad = saladBuilder.build();
        System.out.println("Eu pedi também: " + salad);
    }

}
