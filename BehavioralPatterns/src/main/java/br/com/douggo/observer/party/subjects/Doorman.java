package br.com.douggo.observer.party.subjects;

import br.com.douggo.observer.party.observers.Observer;

public class Doorman extends Subject {
	private boolean status = false;
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean newStatus) {
		this.status = newStatus;
	}

	@Override
	public void notifyObservers() {
		if (!this.status) {
			return;
		}
		this.observers.forEach(Observer::act);
	}
}
