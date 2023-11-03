package br.com.douggo.mediator.chat.mediator;

import br.com.douggo.mediator.chat.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Mediator {

    protected Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        this.users.put(user.getName(), user);
        System.out.println(String.format("'%s' has entered the chat", user.getName()));
    }

    public void removeUser(User user) {
        this.users.remove(user.getName());
        System.out.println(String.format("'%s' has left the chat", user.getName()));
    }

    public void sendMessage(String message, User to, User from) {
        if (Objects.isNull(to)) {
            for (User user: this.users.values()) {
                if (user.getName().equalsIgnoreCase(from.getName())) {
                    continue;
                }
                user.receiveMessage(getMessage(message, to, from), from);
            }
        } else {
            to.receiveMessage(getMessage(message, to, from), from);
        }
    }

    protected abstract String getMessage(String message, User to, User from);

}
