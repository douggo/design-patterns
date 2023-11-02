package br.com.douggo.mediator.swing.components;

import br.com.douggo.mediator.swing.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButton extends JButton {

    private static final long serialVersionUID = -6342423452342432341L;

    public AddButton(Mediator mediator) {
        super("Click me!");
        this.addActionListener(e -> mediator.buttonClicked());
    }


}
