package 제어문;

import java.util.Scanner;

public class 시간입력 {

	public static void main(String[] args) {
		Scanner time = new Scanner(System.in);
		System.out.print("지금 시각은 : ");
		int choose = time.nextInt();
		System.out.println("-------------------------------------");
		if(choose<10) {
			System.out.println("good morning ~ !!!");
		}else if(10<=choose && 14>choose) {
			System.out.println("good afternoon ~ !!!");
		}else if(14<=choose &&	20>choose) {
			System.out.println("good evening ~ !!!");
		}else {
			System.out.println("good night ~ !!!");
		}

	}

}
