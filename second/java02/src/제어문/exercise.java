package 제어문;

import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		Scanner like = new Scanner(System.in);
		System.out.println("좋아하는 과목은? ");
		System.out.println("(선택 : 1. 파이썬 2. 자바 3. C++)");
		int choose = like.nextInt();
		if(choose == 1) {
			System.out.println("파이썬은 쉽고 강해요.");
		}else if(choose ==2) {
			System.out.println("자바는 실무에서 쓰여요.");
		}else {
			System.out.println("C++은 정교해요!");
		}

	}

}
