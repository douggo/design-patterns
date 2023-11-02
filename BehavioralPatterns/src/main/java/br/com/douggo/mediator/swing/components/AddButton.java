package br.com.douggo.mediator.swing.components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends JButton {

    private static final long serialVersionUID = -6342423452342432341L;

    public AddButton(State state, Label label) {
        super("Click me!");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.addCount();
                label.refresh();
                if (state.getCounter() == 10) {
                    setEnabled(false);
                }
            }
        });
    }


}
