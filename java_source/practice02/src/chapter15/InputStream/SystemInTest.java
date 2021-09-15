package chapter15.InputStream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		/*
		System.out.println("알파벳 여러개를 쓰고 엔터를 누르세요");
		int i = 0;
		try {
			while((i = System.in.read()) != '\n'){ //알파벳 여러개니까 i 한개를 while로 여러번 반복 //\n - 문자열에서 줄바꿈을 의미
			// i가 진행되서 넘어오고 \n이 아닌동안 계속 읽는것  \n -> 엔터를 누르라고 했으니까 줄바꿈 엔터 누르기 전까지 반복되는것.
				System.out.print((char)i); // println은 줄 개행. ln 지우기
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
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
