package 변수;

public class Me {

	public static void main(String[] args) {
		//변수를 만들어 봅시다.
		int age = 100;
		byte count = 127; //-128~127
		short count2 = 30000; //-3만~ 3만
		long count3 = 3023151321513546543L; //21억개 넘을때 사용
		int last = age-1;
		double sight = 0.1;
		char gender = '남';
		boolean food = true;//false;
		String name = "박하사탕";
		float sight2 =0.9f;
		
		System.out.println("나의 살던 고향년도 :" + age + "년 입니다.");
		System.out.println("나의 작년 나이 :" + last +"살 입니다.");
		System.out.println("저의 시력은" + sight +"입니다.");
		System.out.println("내 성별은 " + gender);
		System.out.println("아침을 먹었나요?? " +food);
		System.out.println("저의 이름은 : " +name+"입니다.");
		
		

	}

}
