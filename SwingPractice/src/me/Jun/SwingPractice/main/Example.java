package me.Jun.SwingPractice.main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example
{
	public static void main(String args[])
	{
		Dimension dim = new Dimension(500, 500);
		
		JFrame frame = new JFrame("House");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		CardLayout layout = new CardLayout();
		frame.setLayout(layout);
		
		Panel panel = new Panel();
		panel.setBackground(Color.BLUE);
		frame.add(panel);
		
		Panel panel2 = new Panel();
		panel2.setBackground(Color.RED);
		frame.add(panel2);
		
		MouseListener mouse = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				layout.next(frame.getContentPane());
				System.out.println("hi");
			}
		};
		
		panel.addMouseListener(mouse);
		panel2.addMouseListener(mouse);
//		FlowLayout layout = new FlowLayout();
//		BoxLayout layout = new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS);
		
		for(int i=0;i<20;++i) {
			frame.add(new JButton("Test Button"));
		}

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