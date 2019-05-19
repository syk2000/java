package 제어문;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		System.out.println("순차적으로 실행");
		System.out.println("조건에 따라 분기");
		System.out.println("==================================");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 : ");
		String oper = sc.next();
		char op = oper.charAt(0);// charAt() 연산자를 한 글자 씩 가져 올 수 있음 위치값은 0부터  시작하기 때문에  0을 넣으면 된다.
		System.out.println("");
		switch(op) {
		case '+' :
			System.out.println(num1+num2);
			break;
		case '-' :
			System.out.println(num1-num2);
			break;
		case '*' :
			System.out.println(num1*num2);
			break;
		case '/' :
			System.out.println(num1/num2);
			break;
		}
		System.out.println("");
		System.out.println("------------------------------------");
		System.out.println(op+"가 아니면 계산 할 수 없어요.");
		

		

	}

}
