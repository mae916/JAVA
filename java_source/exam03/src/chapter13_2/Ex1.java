package chapter13_2;

public class Ex1 {
	public static void main(String[]args) {
		MyCalc calc = (x, y) -> x + y; // add(int num1, int num2); // ���ٽ��� �޼��� ���� 1���� ����
		
		/*
		MyCalc calc = (x, y) -> {
			num = 200; // public final -> ���ȭ, ���� ����Ŭ�󽺷� Ȯ��� ���ٽ�
			return x + y;
		};
		*/
		
		/*
		MyCalc calc = new MyCalc() {	
			public int add(int num1, int num2 ) {
				return num1 + num2;
			}
		};
		*/
		
		System.out.println(calc.add(100, 200));
	}
}
