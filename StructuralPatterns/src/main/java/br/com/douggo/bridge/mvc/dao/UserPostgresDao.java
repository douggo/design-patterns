package br.com.douggo.bridge.mvc.dao;

import br.com.douggo.bridge.mvc.model.User;

public class UserPostgresDao{

	public void save(User user) {
		System.out.println("Saving the user in the Postgres Database!");
	}
}
