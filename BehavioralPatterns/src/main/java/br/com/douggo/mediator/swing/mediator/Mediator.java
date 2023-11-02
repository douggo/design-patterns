package br.com.douggo.mediator.swing.mediator;

import br.com.douggo.mediator.swing.components.AddButton;
import br.com.douggo.mediator.swing.components.Label;
import br.com.douggo.mediator.swing.components.ResetButton;
import br.com.douggo.mediator.swing.components.State;

public class Mediator {

    private AddButton button;
    private ResetButton reset;
    private State state;
    private Label label;

    public void setButton(AddButton button) {
        this.button = button;
    }

    public void setReset(ResetButton reset) {
        this.reset = reset;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public void buttonClicked() {
        this.state.addCount();
        this.label.refresh();
    }

    public void stop() {
        this.button.setEnabled(false);
    }

    public void reset() {
        this.state.setCounter(0);
        this.button.setEnabled(true);
        this.label.refresh();
    }

    public int getCounterValue() {
        return this.state.getCounter();
    }

}
