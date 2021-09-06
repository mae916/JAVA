package chapter10.interfaceex;

public class CalculatorTest {
	public static void main(String[]args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc(); // 인터페이스에서 상속받았다고 할 수 있음. Calc 타입으로 업캐스팅 가능
		
		//Calc calc1 = new Calc(); 인터페이스라 생성X
		//Calc calc2 = new Calculator(); 추상클래스라 생성X
		
		System.out.println(calc.add(num1, num2));
	}
}
