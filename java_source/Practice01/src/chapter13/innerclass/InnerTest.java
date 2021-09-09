package chapter13.innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() { // 보통 내부클래스 생성은 외부 클래스 생성자에서 이뤄진다. 
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
