package chapter13_2;

@FunctionalInterface // 람다식
public interface MyCalc {
	int add(int num1, int num2);
	//int subtract(int num1, int num2); // 1개만 정의 가능
}
