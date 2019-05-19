package 제어문;

import java.util.Scanner;

public class 입력테스트2 {

	public static void main(String[] args) {
		//입력 연습
		//입력할 수 있는 부품을 사용해야한다.
		/* 
		Scanner sc = new Scanner(System.in);
					//()안에 입력 값이 복사하는 파일에 따라 바뀔 수있다.
		System.out.print("당신의 나이는");
		int age = sc.nextInt();
					//console 창에다가 값을 입력하게 해주게 한다. next()에서는 String 값이 자동으로 들어간다. nextInt()는 String을 int값으로 한번더 바꿔 준 것이다.
		//모든 입력의 데이터 타입은 String!!!
		//Scanner의 nextInt()는 String-> int로 변환
		System.out.println("당신의 나이는 " + age + "세  시군요.");
		*/
		/*
		//이름 입력, 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 : ");
		String name = sc.next() ; //String 입력받아서 자바프로그램으로 가져다 주는 명령어.
		System.out.println("당신의 이름은 " + name + "이 시군요.");
				//scanner은 한번만 복사해서 쓴다.
		*/
		Scanner menu = new Scanner(System.in);
		//menu라는 변수 값이
		System.out.println("저기요 !!!");
		System.out.println("-----------------------------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("-----------------------------------");
		System.out.println("1. 짜장면,		2.짬뽕,		3.우동");
		System.out.println("-----------------------------------");
		System.out.print("당신의 선택은? ");
		int choose = menu.nextInt();
		//choose 라는 변수 값 안으로 menu 값이 들어가야 한다.
		if(choose == 1) {
			System.out.println("당신은 짜장면을 주문하셨습니다.");
		}else if(choose ==2) {
			System.out.println("당신은 짬뽕을 주문하셨습니다.");
		}else{
			System.out.println("당신은 우동을 주문하셨습니다.");
		}
	}

}
