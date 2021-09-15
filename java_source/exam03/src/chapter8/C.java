package chapter8;

public class C extends B {
	int numC = 30;
	
	void methodC() {
		System.out.println("메서드C");
	}
	
	C() {
		super();
		System.out.println("C 생성자");
	}
	
	void method() {
		System.out.println("C 클래스 메서드");
	}
}
