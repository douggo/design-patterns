package br.com.douggo.decorator.swing;

import javax.swing.*;
import java.awt.*;

public class Client {

	public static void main(String[] args) {
		JFrame frame =new JFrame();
		frame.setLayout(new FlowLayout());

		JScrollPane scroll = new JScrollPane(
				new JTextArea(10, 30),
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS
		);
		frame.add(scroll);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.setVisible(true);
	}
}
