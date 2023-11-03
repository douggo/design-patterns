package br.com.douggo.mediator.chat.model;

import br.com.douggo.mediator.chat.mediator.Mediator;

import java.util.Objects;

public class User {

    protected final String name;
    protected final Language language;
    protected final Mediator mediator;

    public User(String name, Language language, Mediator mediator) {
        this.name = name;
        this.language = language;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public Language getLanguage() {
        return language;
    }

    public void sendMessage(String message) {
        this.sendMessage(message, null);
    }

    public void sendMessage(String message, User to) {
        String receiverName = Objects.nonNull(to) ? to.getName() : "ALL";
        System.out.println(String.format("'%s' sent the message '%s' to '%s'", this.name, message, receiverName));
        this.mediator.sendMessage(message, to, this);
    }

    public void receiveMessage(String message, User from) {
        System.out.println(String.format("'%s' has received message '%s' from '%s'", this.name, message, from.getName()));
    }
}
