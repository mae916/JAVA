package chapter13_2;

public class Ex1 {
	public static void main(String[]args) {
		MyCalc calc = (x, y) -> x + y; // add(int num1, int num2); // 람다식은 메서드 정의 1개만 가능
		
		/*
		MyCalc calc = (x, y) -> {
			num = 200; // public final -> 상수화, 지역 내부클라스로 확장된 람다식
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
