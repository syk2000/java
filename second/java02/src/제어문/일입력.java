package ���;

import java.util.Date;

public class ���Է� {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth();
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.println("31�� �Դϴ�."); break;
		case 2 :
		System.out.println("28�� �Դϴ�."); break;
		default :
			System.out.println("30�� �Դϴ�.");
		}
	}

}
