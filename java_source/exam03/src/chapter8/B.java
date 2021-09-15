package chapter8;

public class B extends A {
	int numB = 20;
	
	void methodB() {
		System.out.println("메서드 B");
	}
	
	B() {
		
		System.out.println("B 생성자");
	}
	
	void method() {
		System.out.println("B 클래스 메서드");
	}
}
