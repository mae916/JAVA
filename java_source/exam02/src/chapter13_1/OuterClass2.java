package chapter13_1;

public class OuterClass2 {
	int num = 10;
	static int sNum = 20;
	
	static class InnerClass {
		void methode() {
			//num = 20;
			//outerMethod2();
			//sNum = 30;
			//outerMethod();
			System.out.println("static 내부 클래스 메서드");
		}
	}
	
	void outerMethod2() {
		
	}
	
	static void outerMethod() {
		//num = 20;
		sNum = 30;
	}
}
