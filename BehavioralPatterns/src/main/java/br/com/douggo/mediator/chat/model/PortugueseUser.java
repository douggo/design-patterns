package br.com.douggo.mediator.chat.model;

import br.com.douggo.mediator.chat.mediator.Mediator;

public class PortugueseUser extends User {

    public PortugueseUser(String name, Mediator mediator) {
        super(name, Language.PORTUGUESE, mediator);
    }

}
