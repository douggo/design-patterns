package br.com.douggo.prototype.protoBuilder;

import br.com.douggo.prototype.protoBuilder.model.Address;
import br.com.douggo.prototype.protoBuilder.model.User;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User("ToClone", 25, new Address("ABC Street", 1000));
		System.out.println(user);
	}
}