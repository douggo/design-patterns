package br.com.douggo.memento;

import br.com.douggo.memento.component.TextAreaWithMemory;

import javax.swing.*;
import java.awt.*;

public class Client {

	public static void main(String[] args) {
				
		JFrame frame = new JFrame();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Memento");
		frame.setLayout(new BorderLayout());
		
		JButton previous = new JButton("<<");
		JButton next = new JButton(">>");
		
		frame.add(previous, BorderLayout.WEST);
		frame.add(next, BorderLayout.EAST);
		
		TextAreaWithMemory originator = new TextAreaWithMemory(5, 10);
		JScrollPane scroll = new JScrollPane(originator, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.add(scroll, BorderLayout.CENTER);
		
		JPanel bottomPanel = new JPanel(new FlowLayout());
		JComboBox<String> mementosList = new JComboBox<String>();
		JButton save = new JButton("Save");
		bottomPanel.add(mementosList);
		bottomPanel.add(save);
		
		frame.add(bottomPanel, BorderLayout.SOUTH);
		
		
		frame.setSize(400,200);  
		frame.setVisible(true);
	}
}
