package chapter13.lambda;

public class TestMyNumber {
	public static void main(String[]args) {
		MyNumber maxNum = (x, y) -> (x>= y)? x: y; // y보다 x가 더 크거나 작으면 x를 반환, 아니면 y를 반환
		
		
		
		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);
	}
}
