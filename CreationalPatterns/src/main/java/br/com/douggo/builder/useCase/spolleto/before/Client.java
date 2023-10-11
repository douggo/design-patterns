package br.com.douggo.builder.useCase.spolleto.before;

import br.com.douggo.builder.useCase.spolleto.before.model.Pasta;
import br.com.douggo.builder.useCase.spolleto.before.model.Size;

import java.util.Arrays;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		Pasta p1 = new Pasta(Size.LARGE);
		System.out.println(p1);
		
		Pasta p2 = new Pasta(
				Arrays.asList("Bacon", "Broccoli"),
				Collections.singletonList("Tomato"),
				Size.SMALL,
				true
		);
		System.out.println(p2);
		
		Pasta p3 = new Pasta(
				Collections.singletonList("Garlic"),
				Arrays.asList("Funghi", "Cheese"),
				Size.STANDARD,
				false,
				true
		);
		System.out.println(p3);
		
	}
}
