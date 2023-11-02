package br.com.douggo.mediator.swing.components;

import javax.swing.*;

public class Label extends JLabel {

    private static final long serialVersionUID = 4785399240274598325L;

    private State state;

    public Label(State state) {
        super("Times clicked: 0");
        this.state = state;
    }

    public void refresh() {
        super.setText("Times clicked: " + state.getCounter());
    }


}
