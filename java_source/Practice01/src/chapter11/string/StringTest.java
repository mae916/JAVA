package chapter11.string;

public class StringTest {
	public static void main(String[]args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//�� �ν��Ͻ��� �����Ǿ��� ������ �ּ� ���� �ٸ�
		System.out.println(str1 == str2); 
		
		String str3 = "test";
		String str4 = "test";
		
		//���� �޸𸮸�(���ڿ� ���) ����Ŵ. 
		System.out.println(str3 == str4);
		
	}
}
