package chapter13.lambda;

public class TestMyNumber {
	public static void main(String[]args) {
		MyNumber maxNum = (x, y) -> (x>= y)? x: y; // y���� x�� �� ũ�ų� ������ x�� ��ȯ, �ƴϸ� y�� ��ȯ
		
		
		
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
	}
}
