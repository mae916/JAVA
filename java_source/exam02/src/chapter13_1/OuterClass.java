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
		static int inSNum = 20; // 오류- jdk 15 이하, jdk16 이상 - 오류 X
		
		void innerMethod() {
			System.out.println("OuterClass num : " + num);
			System.out.println("OuterClass snum : " + snum);
<<<<<<< HEAD
=======

>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
			System.out.println("InnerClass inNum : " + inNum);
			System.out.println("InnerClass inSnum : " + inSNum);
		}
		
		static void innerStaticMethod() { // jdk15 이하 오류, jdk 16 이상 오류 X  
			System.out.println("static 메서드");
		}
	}
<<<<<<< HEAD
}
=======
	
	
}
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
