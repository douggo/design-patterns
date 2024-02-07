package br.com.douggo.state.headphone.states;

import br.com.douggo.state.headphone.HeadPhone;

public interface HeadphoneState {

    void onClick(HeadPhone headphone);
    void onLongClick(HeadPhone headphone);

}
