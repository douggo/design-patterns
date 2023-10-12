package br.com.douggo.adapter.hexagonal.core.usecases;

import br.com.douggo.adapter.hexagonal.core.model.User;
import br.com.douggo.adapter.hexagonal.core.ports.UserRepository;
import br.com.douggo.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

import java.util.List;

public class UserService {

    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserMemoryDatabaseAdapter();
    }

    public void saveUser(User user) {
        boolean emailAlreadyUsed = this.userRepository.getAll()
                .stream()
                .anyMatch(dbUser -> dbUser.getEmail().equalsIgnoreCase(user.getEmail()));
        if (emailAlreadyUsed) {
            throw new RuntimeException("E-mail already being used!");
        }
        this.userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return this.userRepository.getAll();
    }

    public User findUser(String email) {
        boolean userExists = this.userRepository.getAll()
                .stream()
                .anyMatch(dbUser -> dbUser.getEmail().equalsIgnoreCase(email));
        if (!userExists) {
            throw new RuntimeException("User not found!");
        }
        return this.userRepository.get(email);
    }


}
