package ���;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�л��� �̸��� �Է� : ");
		String name = sc.next();
		System.out.print("�л��� ������ �Է� : ");
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println(name+"�� ������"+score+"�̸�" + "A"+"�����Դϴ�.");
		}else if(score >= 80) {
			System.out.println(name+"�� ������"+score+"�̸�" + "B"+"�����Դϴ�.");
		}else if(score >= 70) {
			System.out.println(name+"�� ������"+score+"�̸�" + "C"+"�����Դϴ�.");
		}else if(score >= 60){
			System.out.println(name+"�� ������"+score+"�̸�" + "D"+"�����Դϴ�.");
		}else {
			System.out.println(name+"�� ������"+score+"�̸�" + "F"+"�����Դϴ�.");
		} 

	}

}
