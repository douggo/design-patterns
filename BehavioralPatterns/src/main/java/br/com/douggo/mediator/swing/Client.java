package br.com.douggo.mediator.swing;

import br.com.douggo.mediator.swing.components.AddButton;
import br.com.douggo.mediator.swing.components.Label;
import br.com.douggo.mediator.swing.components.ResetButton;
import br.com.douggo.mediator.swing.components.State;

import javax.swing.*;
import java.awt.*;

public class Client {

    public static void main(String[] args) {
        Screens screens = new Screens();
        screens.init();
    }

}
