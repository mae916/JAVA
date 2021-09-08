 package chapter10.interfaceex;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() { //default를 없애면 오류남. 인터페이스는 구현코드를 가질 수 없기 때문에
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total(int[]arr) {
		int total = 0;
		
		for(int i:arr) {
			total += i;
		}
		return total;
	}

} 