package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϴ� ������ �Է� : (�н�, �ѽ�, �Ͻ�, ��) : ");
		String food = sc.next();
		switch(food) {//break�� �ɸ��� �ʾ� �Է��� �� �ؿ� �� ���´�. �׷��� break�� ��� �Ѵ�.
		case "�н�":
			System.out.println("�н��� ����.");
			break;
		case "�ѽ�":
			System.out.println("�ѽ��� ����.");
			break;
		case "�Ͻ�":
			System.out.println("�Ͻ��� ����.");
			break;
		case "��":
			System.out.println("���� ����.");
			break;
		default://default�� �� ���� �ʾƵ� �ȴ�.
			System.out.println("�Ļ� NO~!!!");
		}
	}

}
