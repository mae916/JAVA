package chapter13.lambda;

interface PrintString {
	void showString(String str);
}

public class LambdaTest {
	public static void main(String[]args) {
		
		PrintString lambdaPrint = str -> System.out.println(str); //함수를 변수처럼 사용
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint); // static 내에 있기 때문에(static메서드) static 함수를 만들어야함
		
		PrintString reStr = returnPrint();
		reStr.showString("Hello");
	}
	
	public static void showMyString(PrintString lambda) { //lambdaPrint를 받을건데 얘의 매개변수 타입은 PrintString이라 이걸로 적어줌
		lambda.showString("test2");
	}
	
	public static PrintString returnPrint() {
		return s-> System.out.println(s + "world");
	}
}
