package br.com.douggo.observer.swing;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    private static final long serialVersionUID = -6974338600947333550L;

    private int count;
    private final String text;

    public Label(String text) {
        super(text);
        this.text = text;
        this.count = 0;
        setFont(new Font(getFont().getName(), Font.BOLD, 30));
        increment();
    }

    public void increment() {
        setText(String.format("%s (%d)", this.text, this.count));
        count++;
    }

}
