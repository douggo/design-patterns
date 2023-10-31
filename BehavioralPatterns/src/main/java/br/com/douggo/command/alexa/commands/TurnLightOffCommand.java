package br.com.douggo.command.alexa.commands;

import br.com.douggo.command.alexa.lights.GenericLight;

public class TurnLightOffCommand implements Command {

    private final GenericLight light;

    public TurnLightOffCommand(GenericLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }

}
