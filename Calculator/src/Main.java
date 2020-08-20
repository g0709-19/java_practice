import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("����");
		frame.setLocation(200, 200);
		frame.setPreferredSize(new Dimension(300, 400));
		
		JPanel resultPanel = new JPanel();
		resultPanel.setBackground(Color.WHITE);
		JLabel resultLabel = new JLabel(String.valueOf(0));
		Font font = new Font("Arial", Font.PLAIN, 50);
		resultLabel.setFont(font);
		resultPanel.add(resultLabel);
		
		JPanel calcuratePanel = new JPanel();
		calcuratePanel.setLayout(new BoxLayout(calcuratePanel, BoxLayout.X_AXIS));
		JButton plus = new JButton("+");
		calcuratePanel.add(plus);
		
		// ���� �̿��ؼ� ó�� �����ư ���� �� Ǫ��
		// �ι�° �����ư ������ ���ؼ� ����
		
		JPanel numpadPanel = new JPanel();
		for (int i=1; i<=9; ++i) {
			numpadPanel.add(new NumberButton(resultLabel, i));
		}
		
		JPanel othersPanel = new JPanel();
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
		bottomPanel.add(numpadPanel);
		bottomPanel.add(othersPanel);
		
		JPanel tempPanel = new JPanel();
		tempPanel.setLayout(new BoxLayout(tempPanel, BoxLayout.Y_AXIS));
		tempPanel.add(resultPanel);
		tempPanel.add(calcuratePanel);
		tempPanel.add(bottomPanel);
		
		frame.add(tempPanel);
		
		frame.pack();
		frame.setVisible(true);
	}
}

enum CAL_TYPE { ADD, SUB, MULTIPLY, DIVIDE }

// �������̽��� ����� �ߺ� �ڵ� ���� �� ���� ������?
class CalcurateButton extends JButton {
	public CalcurateButton(JLabel label, int num) {
		super(String.valueOf(num));
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText()+num);
			}
			
		});
	}
}


class NumberButton extends JButton {
	public NumberButton(JLabel label, int num) {
		super(String.valueOf(num));
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText()+num);
			}
			
		});
	}
}
