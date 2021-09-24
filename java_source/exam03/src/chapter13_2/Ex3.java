package chapter13_2;

@FunctionalInterface
interface MyInterface2 {
	void printString(String s);
}


public class Ex3 {
	public static void main(String[] args) {
		MyInterface2 my = s -> System.out.println(s);

	}

}
