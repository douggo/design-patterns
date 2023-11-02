package br.com.douggo.mediator.swing;

import br.com.douggo.mediator.swing.components.AddButton;
import br.com.douggo.mediator.swing.components.Label;
import br.com.douggo.mediator.swing.components.ResetButton;
import br.com.douggo.mediator.swing.components.State;
import br.com.douggo.mediator.swing.mediator.Mediator;

import javax.swing.*;
import java.awt.*;

public class Screens {

    private final AddButton button;
    private final ResetButton reset;
    private final Label label;
    private final State state;
    private final Mediator mediator;

    public Screens() {
        this.mediator = new Mediator();
        this.button = new AddButton(this.mediator);
        this.reset = new ResetButton(this.mediator);
        this.label = new Label(this.mediator);
        this.state = new State(this.mediator);
        this.mediator.setButton(this.button);
        this.mediator.setState(this.state);
        this.mediator.setReset(this.reset);
        this.mediator.setLabel(this.label);
    }

    private void createButtonClickScreen() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Button's Screen");
        frame.setLayout(new BorderLayout());

        frame.add(this.reset, BorderLayout.WEST);
        frame.add(this.button, BorderLayout.CENTER);

        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    private void createCounterScreen() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Counter's Screen");

        frame.add(this.label);

        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public void init() {
        this.createButtonClickScreen();
        this.createCounterScreen();
    }


}
