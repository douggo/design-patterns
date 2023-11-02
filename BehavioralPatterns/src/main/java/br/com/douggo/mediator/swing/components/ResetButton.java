package br.com.douggo.mediator.swing.components;

import br.com.douggo.mediator.swing.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {

    private static final long serialVersionUID = -587643908548673498L;

    public ResetButton(Mediator mediator) {
        super("Reset");
        this.addActionListener(e -> mediator.reset());
    }

}
