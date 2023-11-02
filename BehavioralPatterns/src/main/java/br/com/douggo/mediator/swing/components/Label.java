package br.com.douggo.mediator.swing.components;

import br.com.douggo.mediator.swing.mediator.Mediator;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    private static final long serialVersionUID = 4785399240274598325L;

    private Mediator mediator;

    public Label(Mediator mediator) {
        super("Times clicked: 0");
        this.setFont(new Font(this.getFont().getName(), Font.BOLD, 30));
        this.mediator = mediator;
    }

    public void refresh() {
        super.setText("Times clicked: " + mediator.getCounterValue());
    }


}
