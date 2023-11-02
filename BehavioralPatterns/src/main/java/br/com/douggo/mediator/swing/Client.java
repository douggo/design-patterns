package br.com.douggo.mediator.swing;

import br.com.douggo.mediator.swing.components.AddButton;
import br.com.douggo.mediator.swing.components.Label;
import br.com.douggo.mediator.swing.components.ResetButton;
import br.com.douggo.mediator.swing.components.State;

import javax.swing.*;
import java.awt.*;

public class Client {

    private final AddButton button;
    private final ResetButton reset;
    private final Label label;
    private final State state;

    public Client() {
        this.state = new State();
        this.label = new Label(this.state);
        this.button = new AddButton(this.state, this.label);
        this.reset = new ResetButton(this.state, this.label, this.button);
    }

    public void run() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel title = new JLabel("Counter");
        frame.add(title, BorderLayout.NORTH);

        frame.add(this.reset, BorderLayout.WEST);
        frame.add(this.button, BorderLayout.CENTER);
        frame.add(this.label, BorderLayout.SOUTH);

        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Client().run();
    }

}
