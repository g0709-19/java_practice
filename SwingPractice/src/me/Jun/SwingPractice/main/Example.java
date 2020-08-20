package me.Jun.SwingPractice.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Example
{
	public static void main(String args[])
	{
		Dimension dim = new Dimension(500, 500);
		
		JFrame frame = new JFrame("House");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		GridLayout layout = new GridLayout(2, 1);
		frame.setLayout(layout);
		
		JLabel label = new JLabel(String.valueOf(0));
		label.setFont(new Font("Arial", Font.BOLD, 50));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton button = new JButton("Click!");
		button.setBackground(Color.PINK);
		button.setFont(new Font("Cooper Blk BT", Font.BOLD, 50));		
		button.setToolTipText("버튼을 클릭하면 숫자가 늘어날거에요.");
		
		frame.add(label);
		frame.add(button);
		
		ClickEvent click = new ClickEvent(label);
		button.addActionListener(click);
		
		frame.pack();
		frame.setVisible(true);
	}
}

class ClickEvent implements ActionListener {
	
	private JLabel label;
	
	public ClickEvent(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label.setText(String.valueOf(Integer.valueOf(label.getText())+1));
	}
	
}