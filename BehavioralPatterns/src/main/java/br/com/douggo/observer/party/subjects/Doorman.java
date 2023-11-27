package br.com.douggo.observer.party.subjects;

import br.com.douggo.observer.party.observers.Observer;

public class Doorman extends Subject {
	private boolean status = false;
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean newStatus) {
		if (this.status != newStatus) {
			this.status = newStatus;
		}
		if (this.status) {
			this.notifyObservers();
		}
	}

	@Override
	public void notifyObservers() {
		if (!this.status) {
			return;
		}
		this.observers.forEach(Observer::act);
	}
}
