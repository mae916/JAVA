package chapter13_1;

public class OuterClass2Test {
	public static void main(String[]args) {
		OuterClass2.InnerClass in = new OuterClass2.InnerClass(); // 외부 클래스 생성 여부와 상관 없이 내부 클래스 생성 가능하나(static이기 때문에), 외부클래스 통해서만 접근 가능
	}
}
