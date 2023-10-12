package br.com.douggo.adapter.hexagonal;

import br.com.douggo.adapter.hexagonal.application.UserRest;

import java.util.HashMap;
import java.util.Map;

public class Client {

	public static void main(String[] args) {
		System.out.println("------ Inserindo usuário ------");
		UserRest userRestApi = new UserRest();
		Map<String, String> body = new HashMap<String, String>();
		body.put("email", "user1@email.com");
		body.put("name", "User 1");
		body.put("password", "passwd");
		Integer statusCode = userRestApi.post(body);
		System.out.println(statusCode);

		System.out.println();

		System.out.println("------ Inserindo usuários ------");
		body.put("email", "user2@email.com");
		body.put("name", "User 2");
		statusCode = userRestApi.post(body);
		System.out.println("Usuario 1: " +statusCode);
		body.put("email", "user2@email.com");
		body.put("name", "User 2");
		statusCode = userRestApi.post(body);
		System.out.println("Usuario 2: " +statusCode);

		System.out.println();

		System.out.println("------ Retornando todos os usuários ------");
		statusCode = userRestApi.get();
		System.out.println(statusCode);

		System.out.println();

		System.out.println("------ Buscando usuário user1@gmail.com ------");
		statusCode = userRestApi.getUser("user1@email.com");
		System.out.println(statusCode);
	}
}
