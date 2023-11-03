package br.com.douggo.mediator.chat.mediator;

import br.com.douggo.mediator.chat.model.User;
import br.com.douggo.mediator.chat.services.Translator;

public class TranslatorMediator extends Mediator {

    private final Translator translator = new Translator();

    @Override
    protected String getMessage(String message, User to, User from) {
        return this.translator.getMessageTranslated(from.getLanguage(), to.getLanguage(), message);
    }

}
