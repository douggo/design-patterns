package br.com.douggo.mediator.chat.mediator;

import br.com.douggo.mediator.chat.model.User;

public class ChatMediator extends Mediator {

    @Override
    protected String getMessage(String message, User to, User from) {
        return message;
    }

}
