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
		
		MyInterface my = x -> x; // ��ó�� �Ű������� �Ѱ��϶��� �̷��� ���൵ ��
		
	}
}
