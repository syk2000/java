package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 한줄 삭제 = 컨트롤+D
		// 컨트롤 +쉬프트+F 자동 줄 맞추기
		int x = 5;
		int y = 3;
		System.out.println(x+y);
		
		int z = x+y;
		System.out.println("두수의 합은" + z);
		System.out.println(x+"+"+y+"=" + z);
		//컨트롤 + 알트 + 화살표 아래 = 복사
		System.out.println(x+"+"+y+"="+ (x + y));
		System.out.println(x+"-"+y+"="+ (x - y));
		System.out.println(x+"*"+y+"="+ (x * y));
		System.out.println(x+"/"+y+"="+ (x / y));
		System.out.println(x+"%"+y+"="+ (x % y));
		//이동 : 알트+화살표 방향
	}

}
