package br.com.douggo.mediator.chat.model;

import br.com.douggo.mediator.chat.mediator.Mediator;

public class EnglishUser extends User {

    public EnglishUser(String name, Mediator mediator) {
        super(name, Language.ENGLISH, mediator);
    }

}
