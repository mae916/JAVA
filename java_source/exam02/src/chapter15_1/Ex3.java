package chapter15_1;

import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		
		
		try {
			System.out.print("문자를 입력하시오 : ");
			while(true) {
				int i = System.in.read();
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
