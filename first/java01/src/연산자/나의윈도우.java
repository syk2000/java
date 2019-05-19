package 연산자;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의윈도우 {

	public static void main(String[] args) {
		JFrame f1 = new JFrame();//복사한다.
		f1.setTitle("홍길동의 윈도우 화면");
		f1.setSize(500,500);
		JButton b1 = new JButton("누르시오");
		f1.add(b1);	
		f1.setVisible(true); //항상 밑에 있어야 한다.

	}

}
