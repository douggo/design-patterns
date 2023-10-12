package br.com.douggo.adapter.hexagonal.infrastructure;

import br.com.douggo.adapter.hexagonal.core.model.User;
import br.com.douggo.adapter.hexagonal.core.ports.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMemoryDatabaseAdapter implements UserRepository {

    private final Map<String, User> db = new HashMap<>();

    @Override
    public void save(User user) {
        this.db.put(user.getEmail(), user);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(this.db.values());
    }

    @Override
    public User get(String userEmail) {
        return this.db.get(userEmail);
    }

}
