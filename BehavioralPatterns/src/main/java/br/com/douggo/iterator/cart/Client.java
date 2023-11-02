package br.com.douggo.iterator.cart;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Cart cart = new Cart(
				new Product("TV", 1000d),
				new Product("Shoes", 59.99d),
				new Product("Pencil", 0.5d)
		);

		for (Product product: cart) {
			System.out.println(String.format("Product: %s -> R$ %.2f", product.getDesc(), product.getValue()));
		}

		Stream<Product> productStream = StreamSupport.stream(cart.spliterator(), false);
		Double sum = productStream.reduce(0.0, (aDouble, product) -> aDouble + product.getValue(), Double::sum);
		System.out.println(String.format("Sum: R$ %.2f", sum));

	}
}
