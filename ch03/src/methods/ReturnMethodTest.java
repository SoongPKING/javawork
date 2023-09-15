package methods;

public class ReturnMethodTest {
	// return이 있는 함수(반환 자료형) int String....
	// 호출한 곳으로 반환값을 보냄

	public static void main(String[] args) {
		int n1 = 10, n2 =20;// 지역 변수 - local 변수
		// 더하기 함수 호출
		int result =add(n1,n2);
		System.out.println(result);
		
		// 제곱수 호출
		int result2 = square(n1);
		System.out.println(result2);
		
		String result3 = message();
		System.out.println(result3);
	}
	// return이 있고, 매개변수가 2개인 함수이름 - add()
	public static int add(int a, int b) {
		return a+b;
	}
	//return이 있고, 매개변수가 1개인 함수
	public static int square(int a) {
		return a*a;
		
	}
	//return이 있고, 매개변수가 0개인 함수
	public static String message() {
		return "화이팅";
		
	}
}
