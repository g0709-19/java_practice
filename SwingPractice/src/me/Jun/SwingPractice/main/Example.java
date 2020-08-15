package me.Jun.SwingPractice.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

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
		
		JLabel label = new JLabel();
		label.setText("이승준");
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		label.setFont(font);
		
		Color color = new Color(0x55000000, true);
		Color color2 = new Color(0, 255, 0, 200);
		label.setForeground(color);
		label.setBackground(color2);
		
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	}
}