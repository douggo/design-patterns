package br.com.douggo.mediator.swing.components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {

    private static final long serialVersionUID = -587643908548673498L;

    public ResetButton(State state, Label label, AddButton button) {
        super("Reset");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.setCounter(0);
                button.setEnabled(true);
                label.refresh();
            }
        });
    }

}
