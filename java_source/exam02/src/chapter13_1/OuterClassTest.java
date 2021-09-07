package chapter13_1;

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass out = new OuterClass(); // 외부클래스 생성후 내부 클래스 생성가능
		//OuterClass.InnerClass in = out.new InnerClass();
		
		OuterClass.InnerClass.inSNum = 20;
		OuterClass.InnerClass.innerStaticMethod();
		//in.innerMethod();
	}
}