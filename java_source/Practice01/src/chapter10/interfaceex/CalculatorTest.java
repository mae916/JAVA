package chapter10.interfaceex;

public class CalculatorTest {
	public static void main(String[]args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc(); // �������̽����� ��ӹ޾Ҵٰ� �� �� ����. Calc Ÿ������ ��ĳ���� ����
		
		//Calc calc1 = new Calc(); �������̽��� ����X
		//Calc calc2 = new Calculator(); �߻�Ŭ������ ����X
		
		System.out.println(calc.add(num1, num2));
	}
}
