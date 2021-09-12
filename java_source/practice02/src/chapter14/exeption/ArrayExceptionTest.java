package chapter14.exeption;

public class ArrayExceptionTest {
	public static void main(String[]args) {
		int[] arr = {1,2,3,4,5};
		try {
		for(int i = 0; i < 5; i++) { //�迭�� 5���� �ֱ⶧���� i <= 5; �� �ϸ� ������.(ArrayIndexOutOfBoundsException)
			System.out.println(arr[i]);
		}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); //toString�� ������ �Ǿ��ֱ⶧���� ��ü�� �ҷ��� �״�� ��µǴ°�. �̺κ��� log�� ����� ��.
			//return;
		} finally { //return�� �ߴµ��� finally�� ����Ǵ� ����; try�� ����Ǹ� ������ ����Ǳ� ������. finally�� ���� ����ǰ� return�� ����ȴ�. end�� ������� ����.
			System.out.println("finally");
		}
		System.out.println("end"); // ������ ���� ������ ���� ���ϱ� ������ end�� ��µ��� ����.
	}
}
