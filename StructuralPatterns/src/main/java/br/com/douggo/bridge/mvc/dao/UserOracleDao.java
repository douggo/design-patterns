package br.com.douggo.bridge.mvc.dao;

import br.com.douggo.bridge.mvc.model.User;

public class UserOracleDao{

	public void save(User user) {
		System.out.println("Saving the user in the Oracle Database!");
	}
}
