package chapter5;

public class FunctionTest {
	public static void main(String[]args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2); // �Լ� ȣ��
		System.out.println(num1 + "+" + num2 + "=" + sum + "�Դϴ�.");
		
		sum = subtract(num1, num2); // �Լ� ȣ��
		System.out.println(num1 + "-" + num2 + "=" + sum + "�Դϴ�.");
		
		sum = times(num1, num2); // �Լ� ȣ��
		System.out.println(num1 + "*" + num2 + "=" + sum + "�Դϴ�.");
		
		double sum2 = divide(num1, num2); // �Լ� ȣ��
		System.out.println(num1 + "/" + num2 + "=" + sum2 + "�Դϴ�.");
	}
	
	public static int add(int n1, int n2 ) {
		int result = n1 + n2;
		return result; //����� ��ȯ
	}
	
	public static int subtract(int n1, int n2 ) {
		int result = n1 - n2;
		return result; //����� ��ȯ
	}
	
	public static int times(int n1, int n2 ) {
		int result = n1 * n2;
		return result; //����� ��ȯ
	}
	
	public static double divide(double n1, double n2 ) {
		double result = n1 / n2;
		return result; //����� ��ȯ
	}
}
