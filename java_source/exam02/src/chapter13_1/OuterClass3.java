package chapter13_1;

public class OuterClass3 {
<<<<<<< HEAD
		
	public InnerMyClass outerMethod(int num1, int num2) {
		int num = 20; // 지역 내부 클래스 외부에 정의되어 있는 변수 상수화
		   					// public final -> 데이터 영역, 스택 X
=======
	
	public InnerMyClass outerMethod(int num1, int num2) {
		int num = 20; // 지역 내부 클래스 외부에 정의 되어 있는 변수 상수화
						//public final -> 데이터영역O, 스택X
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
		
		return new InnerMyClass() {
			public void method() {
				System.out.println("지역 내부 클래스");
			}
		};
<<<<<<< HEAD
=======
		
		
		
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
		/*
		InnerMyClass in = new InnerMyClass() {
			public void method() {
				System.out.println("지역 내부 클래스");
			}
		};
<<<<<<< HEAD
		
=======
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
		return in;
		*/
		
		/*
		class InnerClass implements InnerMyClass {
			public void method() {
				//num = 30;
<<<<<<< HEAD

				System.out.println("지역 내부 클래스");
				System.out.println("num = " + num);
			}
=======
				System.out.println("지역 내부 클래스");
				System.out.println("num = " + num);
			};
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
		}
		
		InnerClass in = new InnerClass();
		
		return in;
		*/
	}
}
