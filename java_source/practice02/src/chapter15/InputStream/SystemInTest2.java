package chapter15.InputStream;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[]args) {
		
		for(int i = 0; i <5; i++) {
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요");
		
		int j;
		try {
			while((j = System.in.read()) !='\n') {
				System.out.print((char)j);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		}
	}
}
