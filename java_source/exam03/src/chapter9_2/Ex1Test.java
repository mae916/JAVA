package chapter9_2;

public class Ex1Test {
	
	AbstractEx ex2 = new AbstractEx() {
		int add(int num1, int num2) {
			return num1 + num2;
		}
	};
	
	public static void main(String[]args) {
		/*
		 * �߻�Ŭ������ �ν��Ͻ��� ����� ��.
		 * 1. ���� ���� Ŭ���� -> �޼����
		 * 2. Ŭ������ ������ ����
		 * + �̱����� �κ��� ���� �����ν� �ν��Ͻ��� ������ �� �ִ�.
		 */
		//int num3 = 30; //���ȭ �ȴ�.
		
		AbstractEx ex = new AbstractEx() {
			int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		System.out.println(ex.add(10,20));
		
		Ex1Test ex1test = new Ex1Test();
		System.out.println(ex1test.ex2.add(5,10));
	}
}
