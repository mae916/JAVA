package chapter9_2;

public class Ex1Test {
	
	AbstractEx ex2 = new AbstractEx() {
		int add(int num1, int num2) {
			return num1 + num2;
		}
	};
	
	public static void main(String[]args) {
		/*
		 * 추상클래스를 인스턴스로 만드는 법.
		 * 1. 지역 내부 클래스 -> 메서드안
		 * 2. 클래스의 변수로 지정
		 * + 미구현된 부분을 구현 함으로써 인스턴스를 생성할 수 있다.
		 */
		//int num3 = 30; //상수화 된다.
		
		AbstractEx ex = new AbstractEx() {
			int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		System.out.println(ex.add(10,20));
		
		Ex1Test ex1test = new Ex1Test();
		System.out.println(ex1test.ex2.add(5,10));
	}
}
