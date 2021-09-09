package chapter13.lambda;

public class TestStringConcat {
	public static void main(String[]args) {
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("Hello", "java");
		
		//���ٽ�
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2); // �������̽��� ������ ���ٽ� ����
		concat.makeString("Hello", "java");
		
		//���ٽ� ���ο��� �Ͼ�� ��(�͸� ����Ŭ����)
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
				
			}
		};
		
		concat2.makeString("Hello", "java");
		
	}
}
