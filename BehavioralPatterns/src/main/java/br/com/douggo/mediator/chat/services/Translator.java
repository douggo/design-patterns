package br.com.douggo.mediator.chat.services;

import br.com.douggo.mediator.chat.model.Language;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Translator {

    Map<String, String> engToPor = new HashMap<>();
    Map<String, String> porToEng = new HashMap<>();

    public Translator() {
        createEngToPor();
        createPorToEng();
    }

    private void createPorToEng() {
        this.porToEng.put("Oi", "Hello");
        this.porToEng.put("Tudo bem?", "Everything's alright?");
        this.porToEng.put("Estou bem, obrigado", "I'm good, thanks");
        this.porToEng.put("Tchau", "Bye");
    }

    private void createEngToPor() {
        this.engToPor.put("Hello", "Oi");
        this.engToPor.put("Everything's alright?", "Tudo bem?");
        this.engToPor.put("I'm good, thanks", "Estou bem, obrigado!");
        this.engToPor.put("Bye", "Tchau");
    }

    public String getMessageTranslated(Language senderLanguage, Language receiverLanguage, String message) {
        if (senderLanguage.equals(receiverLanguage)) {
            return message;
        }
        if (senderLanguage.equals(Language.PORTUGUESE)) {
            return Objects.nonNull(this.porToEng.get(message)) ? this.porToEng.get(message) : message;
        } else {
            return Objects.nonNull(this.engToPor.get(message)) ? this.engToPor.get(message) : message;
        }
    }

}
