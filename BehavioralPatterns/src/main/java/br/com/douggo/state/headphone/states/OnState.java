package br.com.douggo.state.headphone.states;

import br.com.douggo.state.headphone.HeadPhone;

public class OnState implements HeadphoneState {

    private final static OnState INSTANCE = new OnState();

    private OnState() {}

    @Override
    public void onClick(HeadPhone headphone) {
        headphone.setIsPlaying(true);
        System.out.println("> Resume Playing");
        headphone.setState(PlayingState.getInstance());
    }

    @Override
    public void onLongClick(HeadPhone headphone) {
        headphone.setIsPlaying(false);
        System.out.println("> Stop playing");
        headphone.setState(OffState.getInstance());
    }

    public static OnState getInstance() {
        return INSTANCE;
    }

}
