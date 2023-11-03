package br.com.douggo.observer.party;

import br.com.douggo.observer.party.observers.Friend;
import br.com.douggo.observer.party.observers.Wife;
import br.com.douggo.observer.party.subjects.Doorman;

public class Client {

	public static void main(String[] args) {
		Wife wife = new Wife();
		Friend friend = new Friend();

		Doorman doorman = new Doorman();
		doorman.addObserver(wife);
		doorman.addObserver(friend);

		/* Husband did not come yet */
		doorman.setStatus(false);

		/* Doorman saw husband enter through the door */
		System.out.println("Husband is coming!");
		doorman.setStatus(true);
	}
}
