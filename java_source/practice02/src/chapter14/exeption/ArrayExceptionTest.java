package chapter14.exeption;

public class ArrayExceptionTest {
	public static void main(String[]args) {
		int[] arr = {1,2,3,4,5};
		try {
		for(int i = 0; i < 5; i++) { //배열이 5까지 있기때문에 i <= 5; 를 하면 오류남.(ArrayIndexOutOfBoundsException)
			System.out.println(arr[i]);
		}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); //toString이 재정의 되어있기때문에 객체로 불러도 그대로 출력되는것. 이부분을 log로 남기면 됨.
			//return;
		} finally { //return을 했는데도 finally가 실행되는 이유; try가 실행되면 무조건 실행되기 때문에. finally가 먼저 실행되고 return이 실행된다. end는 실행되지 않음.
			System.out.println("finally");
		}
		System.out.println("end"); // 오류가 나면 끝까지 돌질 못하기 때문에 end가 출력되지 않음.
	}
}
