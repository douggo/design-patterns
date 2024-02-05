package br.com.douggo.state.headphone;

import br.com.douggo.state.headphone.states.HeadphoneState;
import br.com.douggo.state.headphone.states.OffState;

public class HeadPhone {

	private HeadphoneState state;
	private boolean isOn;
	private boolean isPlaying;
	
	public HeadPhone() {
		this.isOn = false;
		this.isPlaying = false;
		this.state = OffState.getInstance();
	}
	
	public void onLongClick() {
		System.out.println("Long Click Pressed...");
		this.state.onLongClick(this);
	}
	
	public void onClick() {
		System.out.println("Click Pressed...");
		this.state.onClick(this);
	}

	public void setState(HeadphoneState headphoneState) {
		System.out.printf("Changing from %s to %s%n",
				this.state.getClass().getSimpleName(),
				headphoneState.getClass().getSimpleName());
		this.state = headphoneState;
	}

	public void setIsPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public boolean isPlaying() {
		return this.isPlaying;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public boolean isOn() {
		return this.isOn;
	}
}
