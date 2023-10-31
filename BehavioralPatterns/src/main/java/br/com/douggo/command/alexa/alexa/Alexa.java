package br.com.douggo.command.alexa.alexa;

import br.com.douggo.command.alexa.commands.Command;
import br.com.douggo.command.alexa.lights.PhillipsHueLight;
import br.com.douggo.command.alexa.lights.XiaomiLight;

import java.util.HashMap;
import java.util.Map;

public class Alexa {
    private final Map<String, Object> integrations;

    private final AlexaAI artificialIntelligence;

    public Alexa() {
        this.integrations = new HashMap<>();
        this.artificialIntelligence = new AlexaAI();
    }

    public void addIntegration(String voiceCommand, Command command, String... keywords) {
        this.integrations.put(voiceCommand, command);
        this.artificialIntelligence.addAssociation(voiceCommand, keywords);
    }

    public void sendRequest(String voiceCommand) {
        Command command = (Command) integrations.get(voiceCommand);
        if (command == null) {
            String key = this.artificialIntelligence.findAssociations(voiceCommand);
            command = (Command) this.integrations.get(key);
            if (command == null) {
                System.out.println("Sorry, I couldn't perform your request!");
                return;
            }
        }
        System.out.println("Sent a generic command as you saved in my configurations");
        command.execute();
    }

}
