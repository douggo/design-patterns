package br.com.douggo.observer.party.observers;

public class Wife implements Observer {
	
	private void partyTime() {
		System.out.println("Let´s Party! :D");
	}

	@Override
	public void act() {
		this.partyTime();
	}
}