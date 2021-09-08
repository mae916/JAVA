package chapter13_1;

public class OuterClass2 {
	int num = 10;
	static int sNum = 20;
	
	static class InnerClass {
<<<<<<< HEAD
		static int sInNum = 30;
		int inNum = 30;
		void method() {
=======
		void methode() {
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
			//num = 20;
			//outerMethod2();
			//sNum = 30;
			//outerMethod();
<<<<<<< HEAD
			inNum = 40;
			sInNum = 50;
=======
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
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
