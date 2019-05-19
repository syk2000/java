package 제어문;

import java.util.Scanner;

public class 입력테스트3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 음식을 입력 : (분식, 한식, 일식, 집) : ");
		String food = sc.next();
		switch(food) {//break가 걸리지 않아 입력한 값 밑에 다 나온다. 그래서 break를 써야 한다.
		case "분식":
			System.out.println("분식집 ㄱㄱ.");
			break;
		case "한식":
			System.out.println("한식집 ㄱㄱ.");
			break;
		case "일식":
			System.out.println("일식집 ㄱㄱ.");
			break;
		case "집":
			System.out.println("집밥 ㄱㄱ.");
			break;
		default://default는 꼭 쓰지 않아도 된다.
			System.out.println("식사 NO~!!!");
		}
	}

}
