package chapter13_1;

public class OuterClassTest {
	public static void main(String[] args) {
<<<<<<< HEAD
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in = out.new InnerClass();
=======
		OuterClass out = new OuterClass(); // 외부클래스 생성후 내부 클래스 생성가능
		//OuterClass.InnerClass in = out.new InnerClass();
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
		
		OuterClass.InnerClass.inSNum = 20;
		OuterClass.InnerClass.innerStaticMethod();
		//in.innerMethod();
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 29b43c87ffeb5a64305c0bdd950d4f5524439b97
