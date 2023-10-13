package br.com.douggo.bridge.mvc.services;

import br.com.douggo.bridge.mvc.dao.UserDao;
import br.com.douggo.bridge.mvc.model.User;

public class UserEJB implements UserService {

	private final UserDao userDao;

	public UserEJB(UserDao userDao) {
		this.userDao = userDao;
	}

	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		this.userDao.save(user);
	}
}
