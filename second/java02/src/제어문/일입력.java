package 제어문;

import java.util.Date;

public class 일입력 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth();
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.println("31일 입니다."); break;
		case 2 :
		System.out.println("28일 입니다."); break;
		default :
			System.out.println("30일 입니다.");
		}
	}

}
