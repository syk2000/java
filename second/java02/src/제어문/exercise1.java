package 제어문;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력 : ");
		String name = sc.next();
		System.out.print("학생의 점수를 입력 : ");
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println(name+"의 점수는"+score+"이며" + "A"+"학점입니다.");
		}else if(score >= 80) {
			System.out.println(name+"의 점수는"+score+"이며" + "B"+"학점입니다.");
		}else if(score >= 70) {
			System.out.println(name+"의 점수는"+score+"이며" + "C"+"학점입니다.");
		}else if(score >= 60){
			System.out.println(name+"의 점수는"+score+"이며" + "D"+"학점입니다.");
		}else {
			System.out.println(name+"의 점수는"+score+"이며" + "F"+"학점입니다.");
		} 

	}

}
