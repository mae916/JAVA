package chapter14.exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[]args) { // throws FileNotFoundException 처리하면 미루는것. JVM쪽으로 넘어가서 코드가 죽음.
		try(FileInputStream fis = new FileInputStream("a.txt")) {
		} catch (IOException e) {
			System.out.println(e); 
		} 
		System.out.println("end");
	}
}
