package me.Jun.SwingPractice.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Example
{
	public static void main(String args[])
	{
		Dimension dim = new Dimension(500, 500);
		
		JFrame frame = new JFrame("Jun's House");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		GridLayout layout = new GridLayout(2, 3);
		frame.setLayout(layout);
		
		Color[] colors = { Color.YELLOW, Color.RED, Color.BLUE, Color.ORANGE, Color.GREEN, Color.PINK };
		
		for (Color color : colors) {
			Font font = new Font("a나무M", Font.BOLD, 20);
			
			JLabel label = new JLabel();
			label.setText("이승준");
			label.setFont(font);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setOpaque(true);
			label.setForeground(Color.WHITE);
			label.setBackground(color);
			frame.add(label);
		}
		
		frame.pack();
		frame.setVisible(true);
	}
}