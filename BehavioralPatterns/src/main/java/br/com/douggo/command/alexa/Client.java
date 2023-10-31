package br.com.douggo.command.alexa;

import br.com.douggo.command.alexa.alexa.Alexa;
import br.com.douggo.command.alexa.commands.TurnLightOffCommand;
import br.com.douggo.command.alexa.commands.TurnLightOnCommand;
import br.com.douggo.command.alexa.lights.GenericLight;
import br.com.douggo.command.alexa.lights.PhillipsHueLight;
import br.com.douggo.command.alexa.lights.XiaomiLight;

public class Client {

	private final static Alexa alexa = new Alexa();

	public static void main(String[] args) {
		calibrateAlexa();
		alexa.sendRequest("Turn on the lights in the living room");
		alexa.sendRequest("Turn off the lights in the living room");
		alexa.sendRequest("Turn on the lights in the kitchen");
		alexa.sendRequest("Turn off the kitchen lights");
	}

	private static void calibrateAlexa() {
		GenericLight livingRoomLight = new PhillipsHueLight();
		GenericLight kitchenLight = new XiaomiLight();

		alexa.addIntegration("Turn the living room lights off",
				new TurnLightOffCommand(livingRoomLight),
				"light", "living room", "off");

		alexa.addIntegration("Turn the living room lights on",
				new TurnLightOnCommand(livingRoomLight),
				"light", "living room", "on");

		alexa.addIntegration("Turn the kitchen lights off",
				new TurnLightOffCommand(kitchenLight),
				"light", "kitchen", "off");

		alexa.addIntegration("Turn the kitchen lights on",
				new TurnLightOnCommand(kitchenLight),
				"light", "kitchen", "on");
	}
}
