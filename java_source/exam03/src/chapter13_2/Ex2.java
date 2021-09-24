package chapter13_2;

interface MyInterface {
	int printNum(int num);
}

public class Ex2 {
	public static void main(String[]args) {
		/*
		MyInterface my = (x) -> {
			return x;
		};
		*/
		
		MyInterface my = x -> x; // 위처럼 매개변수가 한개일때는 이렇게 써줘도 됨
		
	}
}
