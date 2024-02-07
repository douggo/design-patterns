package br.com.douggo.state.headphone.states;

import br.com.douggo.state.headphone.HeadPhone;

public class PlayingState implements HeadphoneState {

    private final static PlayingState INSTANCE = new PlayingState();

    private PlayingState() {}

    @Override
    public void onClick(HeadPhone headphone) {
        headphone.setIsPlaying(false);
        System.out.println("Paused the music!");
        headphone.setState(OnState.getInstance());
    }

    @Override
    public void onLongClick(HeadPhone headphone) {
        headphone.setOn(false);
        System.out.println("Turning the headphone off!");
        headphone.setState(OffState.getInstance());
    }

    public static PlayingState getInstance() {
        return INSTANCE;
    }
}
