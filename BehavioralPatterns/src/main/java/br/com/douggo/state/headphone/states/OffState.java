package br.com.douggo.state.headphone.states;

import br.com.douggo.state.headphone.HeadPhone;

public class OffState implements HeadphoneState {

    private final static OffState INSTANCE = new OffState();

    private OffState() {}

    @Override
    public void onClick(HeadPhone headphone) {
        System.out.println("Headphone is off! Nothing to do here!");
    }

    @Override
    public void onLongClick(HeadPhone headphone) {
        headphone.setOn(true);
        System.out.println("Turning headphone on!");
        headphone.setState(OnState.getInstance());
    }

    public static OffState getInstance() {
        return INSTANCE;
    }

}
