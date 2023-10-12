package br.com.douggo.adapter.hexagonal.core.ports;

import br.com.douggo.adapter.hexagonal.core.model.User;

import java.util.List;

public interface UserRepository {

    void save(User user);

    List<User> getAll();

    User get(String userEmail);
	
}
