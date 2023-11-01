package br.com.douggo.command.alexa.commands;

import br.com.douggo.command.alexa.lights.GenericLight;

public class TurnLightOnCommand implements Command {

    private final GenericLight light;

    public TurnLightOnCommand(GenericLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
