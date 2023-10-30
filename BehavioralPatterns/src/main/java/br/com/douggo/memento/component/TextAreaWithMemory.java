package br.com.douggo.memento.component;

import br.com.douggo.memento.memory.Memento;

import javax.swing.*;

public class TextAreaWithMemory extends JTextArea {
	private static final long serialVersionUID = 2393587108160522742L;
	
	public TextAreaWithMemory(int rows, int columns) {
		super(rows, columns);
	}

	public TextAreaMemento save() {
		return new TextAreaMemento(this.getText());
	}

	public void restore(TextAreaMemento memento) {
		this.setText(memento.getState());
	}

	public static class TextAreaMemento implements Memento {
		private final String state;

		public TextAreaMemento(String state) {
			this.state = state;
		}

		private String getState() {
			return this.state;
		}
	}


}
