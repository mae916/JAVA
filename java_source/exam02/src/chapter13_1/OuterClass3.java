package chapter13_1;

public class OuterClass3 {
<<<<<<< HEAD
		
	public InnerMyClass outerMethod(int num1, int num2) {
		int num = 20; // ���� ���� Ŭ���� �ܺο� ���ǵǾ� �ִ� ���� ���ȭ
		   					// public final -> ������ ����, ���� X
=======
	
	public InnerMyClass outerMethod(int num1, int num2) {
		int num = 20; // ���� ���� Ŭ���� �ܺο� ���� �Ǿ� �ִ� ���� ���ȭ
						//public final -> �����Ϳ���O, ����X
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
		
		return new InnerMyClass() {
			public void method() {
				System.out.println("���� ���� Ŭ����");
			}
		};
<<<<<<< HEAD
=======
		
		
		
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
		/*
		InnerMyClass in = new InnerMyClass() {
			public void method() {
				System.out.println("���� ���� Ŭ����");
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

				System.out.println("���� ���� Ŭ����");
				System.out.println("num = " + num);
			}
=======
				System.out.println("���� ���� Ŭ����");
				System.out.println("num = " + num);
			};
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
		}
		
		InnerClass in = new InnerClass();
		
		return in;
		*/
	}
}
