package me.Jun.SwingPractice.main;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Example
{
	public static void main(String args[])
	{
		Dimension dim = new Dimension(200, 100);
		
		JFrame frame = new JFrame("Jun's House");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		JLabel label = new JLabel();
		label.setText("setText Test");
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
		
		System.out.println(label.getVerticalAlignment());
		System.out.println(label.getHorizontalAlignment());
	}
}