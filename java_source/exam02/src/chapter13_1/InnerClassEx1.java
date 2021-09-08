package chapter13_1;

public class InnerClassEx1 {
	Ex1Interface ex2 = new Ex1Interface() {
		public void method() {
			System.out.println("method1");
		}
	};
<<<<<<< HEAD
	
=======
		
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
	public void method() {
		int num = 10;
		Ex1Interface ex1 = new Ex1Interface() {
			//num = 20;
<<<<<<< HEAD
			public void method() {
				System.out.println(num + " : method2");
=======
			public void method() { //미구현된 메소드를 구현 해줌.-> 인터페이스 인스턴스생성 가능
				System.out.println("method");
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
			}
		};
		
		ex1.method();
	}
	
<<<<<<< HEAD
	public static void main(String[] args) {
		InnerClassEx1 ex1 = new InnerClassEx1();
		ex1.method();
		
		ex1.ex2.method();
=======
	public static void main(String[]args) {
		InnerClassEx1 ex1 = new InnerClassEx1();
		ex1.method();
		
		InnerClassEx1 ex2 = new InnerClassEx1();
		ex2.method();
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
	}
}
