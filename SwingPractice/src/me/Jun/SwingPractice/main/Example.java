package me.Jun.SwingPractice.main;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example
{
	public static void main(String args[])
	{
		Dimension dim = new Dimension(500, 300);
		
		JFrame frame = new JFrame("Jun's House");
		JLabel label = new JLabel("Hello world");
		frame.add(label);
		frame.setPreferredSize(dim);
		frame.pack();
		frame.setLocation(200, 400);
		frame.setVisible(true);
	}
}