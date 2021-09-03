package chapter5;

public class FunctionTest {
	public static void main(String[]args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2); // 함수 호출
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다.");
		
		sum = subtract(num1, num2); // 함수 호출
		System.out.println(num1 + "-" + num2 + "=" + sum + "입니다.");
		
		sum = times(num1, num2); // 함수 호출
		System.out.println(num1 + "*" + num2 + "=" + sum + "입니다.");
		
		double sum2 = divide(num1, num2); // 함수 호출
		System.out.println(num1 + "/" + num2 + "=" + sum2 + "입니다.");
	}
	
	public static int add(int n1, int n2 ) {
		int result = n1 + n2;
		return result; //결과값 반환
	}
	
	public static int subtract(int n1, int n2 ) {
		int result = n1 - n2;
		return result; //결과값 반환
	}
	
	public static int times(int n1, int n2 ) {
		int result = n1 * n2;
		return result; //결과값 반환
	}
	
	public static double divide(double n1, double n2 ) {
		double result = n1 / n2;
		return result; //결과값 반환
	}
}
