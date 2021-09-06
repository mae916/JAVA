package chapter10.interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) { // 나누어지는 수말고 나누는 수가 0이 되면 안됨
		if(num2 != 0) {
			return num1 / num2;
		}
		return ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다."); 
	}

}
