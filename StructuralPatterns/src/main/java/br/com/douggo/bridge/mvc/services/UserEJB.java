package br.com.douggo.bridge.mvc.services;

import br.com.douggo.bridge.mvc.model.User;

public class UserEJB {

	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
	}
}
