package me.Jun.SwingPractice.main;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame("Jun's House");
		JLabel label = new JLabel("Hello world");
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	}
}