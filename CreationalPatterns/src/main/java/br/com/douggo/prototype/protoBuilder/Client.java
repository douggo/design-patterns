package br.com.douggo.prototype.protoBuilder;

import br.com.douggo.prototype.protoBuilder.model.Address;
import br.com.douggo.prototype.protoBuilder.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User.Builder("Douglas", 26, new Address("Test Street", 580))
				.build();
		User userCloned = user.cloneBuilder()
				.name("Valdecir")
				.age(58)
				.address(new Address("ABC Street", 1000))
				.build();
		System.out.println(user);
		System.out.println(userCloned);
	}
}