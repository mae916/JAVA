package chapter10.interfaceex;

public class CalculatorTest {
	public static void main(String[]args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc(); // �������̽����� ��ӹ޾Ҵٰ� �� �� ����. Calc Ÿ������ ��ĳ���� ����
		
		//Calc calc1 = new Calc(); �������̽��� ����X
		//Calc calc2 = new Calculator(); �߻�Ŭ������ ����X
		
		System.out.println(calc.add(num1, num2));
		
		calc.description();
		
		int[]arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}
}
