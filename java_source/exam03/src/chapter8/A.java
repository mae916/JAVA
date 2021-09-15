package chapter8;

public class A {
	int numA = 10;
	
	void methodA() {
		System.out.println("메서드 A"); // 메서드도 인스턴스가 생성되어야 사용가능
	}
	
	A() {
		
		System.out.println("A 생성자");
	}
	
	void method() {
		System.out.println("A 클래스 메서드");
	}
}
