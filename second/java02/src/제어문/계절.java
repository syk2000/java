package ���;

import java.util.Date;

public class ���� {
	public static void main(String[] args) {
		/*
		Date date = new Date();
		int month = date.getMonth()+1;
		if(month==3 || month == 4 || month ==5) {
			System.out.println("��");
		}else if(month==6 || month == 7 || month ==8) {
			System.out.println("����");
		}else if(month==9 || month == 10 || month ==11) {
			System.out.println("����");
		}else {
			System.out.println("�ܿ�");
		}
		*/
		Date date = new Date();
		int month = date.getMonth()+1;
		switch(month) {
		case 3 : case 4 : case 5 :
			System.out.println("��"); break;
		case 6 :case 7 : case 8 :
			System.out.println("����"); break;
		case 9 : case 10 : case 11 :
			System.out.println("����"); break;
		default :
			System.out.println("�ܿ�");
		}
	}
}


