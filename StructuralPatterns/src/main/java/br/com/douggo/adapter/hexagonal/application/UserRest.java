package br.com.douggo.adapter.hexagonal.application;

import br.com.douggo.adapter.hexagonal.core.model.User;
import br.com.douggo.adapter.hexagonal.core.usecases.UserService;

import java.util.Map;

public class UserRest {

	private final UserService userService;

	public UserRest() {
		this.userService = new UserService();
	}

	public Integer post(Map<String, String> requestBody) {
		int code = 201;
		try {
			this.userService.saveUser(new User.Builder()
					.name(requestBody.get("name"))
					.email(requestBody.get("email"))
					.password(requestBody.get("password"))
					.build());
		} catch(RuntimeException e) {
			code = 400;
		}
		return code;
	}

	public Integer get() {
		System.out.println(this.userService.getAllUsers());
		return 200;
	}

	public Integer getUser(String email) {
		try {
			System.out.println(this.userService.findUser(email));
		} catch(RuntimeException e) {
			return 404;
		}
		return 200;
	}
}
