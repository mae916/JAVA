package chapter15.InputStream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		/*
		System.out.println("���ĺ� �������� ���� ���͸� ��������");
		int i = 0;
		try {
			while((i = System.in.read()) != '\n'){ //���ĺ� �������ϱ� i �Ѱ��� while�� ������ �ݺ� //\n - ���ڿ����� �ٹٲ��� �ǹ�
			// i�� ����Ǽ� �Ѿ���� \n�� �ƴѵ��� ��� �д°�  \n -> ���͸� ������� �����ϱ� �ٹٲ� ���� ������ ������ �ݺ��Ǵ°�.
				System.out.print((char)i); // println�� �� ����. ln �����
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
		
		int i;
		
			try {
				i = System.in.read();
				System.out.println(i);
				System.out.println((char)i);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
	}

}
