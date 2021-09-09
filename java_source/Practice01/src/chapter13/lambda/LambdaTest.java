package chapter13.lambda;

interface PrintString {
	void showString(String str);
}

public class LambdaTest {
	public static void main(String[]args) {
		
		PrintString lambdaPrint = str -> System.out.println(str); //�Լ��� ����ó�� ���
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint); // static ���� �ֱ� ������(static�޼���) static �Լ��� ��������
		
		PrintString reStr = returnPrint();
		reStr.showString("Hello");
	}
	
	public static void showMyString(PrintString lambda) { //lambdaPrint�� �����ǵ� ���� �Ű����� Ÿ���� PrintString�̶� �̰ɷ� ������
		lambda.showString("test2");
	}
	
	public static PrintString returnPrint() {
		return s-> System.out.println(s + "world");
	}
}
