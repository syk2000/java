package ���;

import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		Scanner like = new Scanner(System.in);
		System.out.println("�����ϴ� ������? ");
		System.out.println("(���� : 1. ���̽� 2. �ڹ� 3. C++)");
		int choose = like.nextInt();
		if(choose == 1) {
			System.out.println("���̽��� ���� ���ؿ�.");
		}else if(choose ==2) {
			System.out.println("�ڹٴ� �ǹ����� ������.");
		}else {
			System.out.println("C++�� �����ؿ�!");
		}

	}

}
