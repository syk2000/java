package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ2 {

	public static void main(String[] args) {
		//�Է� ����
		//�Է��� �� �ִ� ��ǰ�� ����ؾ��Ѵ�.
		/* 
		Scanner sc = new Scanner(System.in);
					//()�ȿ� �Է� ���� �����ϴ� ���Ͽ� ���� �ٲ� ���ִ�.
		System.out.print("����� ���̴�");
		int age = sc.nextInt();
					//console â���ٰ� ���� �Է��ϰ� ���ְ� �Ѵ�. next()������ String ���� �ڵ����� ����. nextInt()�� String�� int������ �ѹ��� �ٲ� �� ���̴�.
		//��� �Է��� ������ Ÿ���� String!!!
		//Scanner�� nextInt()�� String-> int�� ��ȯ
		System.out.println("����� ���̴� " + age + "��  �ñ���.");
		*/
		/*
		//�̸� �Է�, ���
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸��� : ");
		String name = sc.next() ; //String �Է¹޾Ƽ� �ڹ����α׷����� ������ �ִ� ��ɾ�.
		System.out.println("����� �̸��� " + name + "�� �ñ���.");
				//scanner�� �ѹ��� �����ؼ� ����.
		*/
		Scanner menu = new Scanner(System.in);
		//menu��� ���� ����
		System.out.println("����� !!!");
		System.out.println("-----------------------------------");
		System.out.println("�޴��� ������.");
		System.out.println("-----------------------------------");
		System.out.println("1. ¥���,		2.«��,		3.�쵿");
		System.out.println("-----------------------------------");
		System.out.print("����� ������? ");
		int choose = menu.nextInt();
		//choose ��� ���� �� ������ menu ���� ���� �Ѵ�.
		if(choose == 1) {
			System.out.println("����� ¥����� �ֹ��ϼ̽��ϴ�.");
		}else if(choose ==2) {
			System.out.println("����� «���� �ֹ��ϼ̽��ϴ�.");
		}else{
			System.out.println("����� �쵿�� �ֹ��ϼ̽��ϴ�.");
		}
	}

}
