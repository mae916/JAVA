package chapter13.innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() { // ���� ����Ŭ���� ������ �ܺ� Ŭ���� �����ڿ��� �̷�����. 
		inClass = new InClass();
	}
	
	class InClass {
		int innum = 200;
		//static sInNum = 100; 
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		

	}

}
