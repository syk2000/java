package ���;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		System.out.println("���������� ����");
		System.out.println("���ǿ� ���� �б�");
		System.out.println("==================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("������ : ");
		String oper = sc.next();
		char op = oper.charAt(0);// charAt() �����ڸ� �� ���� �� ���� �� �� ���� ��ġ���� 0����  �����ϱ� ������  0�� ������ �ȴ�.
		System.out.println("");
		switch(op) {
		case '+' :
			System.out.println(num1+num2);
			break;
		case '-' :
			System.out.println(num1-num2);
			break;
		case '*' :
			System.out.println(num1*num2);
			break;
		case '/' :
			System.out.println(num1/num2);
			break;
		}
		System.out.println("");
		System.out.println("------------------------------------");
		System.out.println(op+"�� �ƴϸ� ��� �� �� �����.");
		

		

	}

}
