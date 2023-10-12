package br.com.douggo.bridge.mvc.dao;

import br.com.douggo.bridge.mvc.model.User;

public class UserMysqlDao{

	public void save(User user) {
		System.out.println("Saving the user in the Mysql Database!");
	}
}
