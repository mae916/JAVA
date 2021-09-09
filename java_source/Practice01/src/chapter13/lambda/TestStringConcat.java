package chapter13.lambda;

public class TestStringConcat {
	public static void main(String[]args) {
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("Hello", "java");
		
		//람다식
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2); // 인터페이스형 변수에 람다식 대입
		concat.makeString("Hello", "java");
		
		//람다식 내부에서 일어나는 일(익명 내부클래스)
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
				
			}
		};
		
		concat2.makeString("Hello", "java");
		
	}
}
