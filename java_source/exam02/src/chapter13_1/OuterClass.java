package chapter13_1;

public class OuterClass {
	public int num = 10;
	private static int snum = 20;
<<<<<<< HEAD

=======
	private InnerClass in;
	
	public OuterClass() {
		in = new InnerClass();
	}
	
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
	class InnerClass {
		int inNum = 10;
		static int inSNum = 20; // ����- jdk 15 ����, jdk16 �̻� - ���� X
		
		void innerMethod() {
			System.out.println("OuterClass num : " + num);
			System.out.println("OuterClass snum : " + snum);
<<<<<<< HEAD
=======

>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
			System.out.println("InnerClass inNum : " + inNum);
			System.out.println("InnerClass inSnum : " + inSNum);
		}
		
		static void innerStaticMethod() { // jdk15 ���� ����, jdk 16 �̻� ���� X  
			System.out.println("static �޼���");
		}
	}
<<<<<<< HEAD
}
=======
	
	
}
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
