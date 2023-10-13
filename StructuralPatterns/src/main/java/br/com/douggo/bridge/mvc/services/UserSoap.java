package br.com.douggo.bridge.mvc.services;

import br.com.douggo.bridge.mvc.dao.UserDao;
import br.com.douggo.bridge.mvc.model.User;

public class UserSoap implements UserService {

	private final UserDao userDao;

	public UserSoap(UserDao userDao) {
		this.userDao = userDao;
	}

	public void save(User user) {
		this.userDao.save(user);
		System.out.println("Starting a save operation through Soap Protocol!");
	}
}
