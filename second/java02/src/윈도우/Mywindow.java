package 윈도우;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JTextField;

public class Mywindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setTitle("나의 윈도우 프로그램");
		
		JButton btnNewButton = new JButton("New button");
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("New button");
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		f.setVisible(true);

	}

}
