package br.com.douggo.command.alexa.alexa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class AlexaAI {

    private Map<String, String[]> associations;

    public AlexaAI() {
        this.associations = new HashMap<>();
    }

    public void addAssociation(String voiceCommand, String[] keywords) {
        this.associations.put(voiceCommand, keywords);
    }

    public String findAssociations(String voiceRequest) {
        for (String[] association: associations.values()) {
            if (Stream.of(association).allMatch(voiceRequest::contains)) {
                return getCommandFromAssociation(association);
            }
        }
        return null;
    }

    private String getCommandFromAssociation(String[] association) {
        return this.associations.entrySet()
                .stream()
                .filter(entry -> Arrays.equals(association, entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }

}
