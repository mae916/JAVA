package chapter14.exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[]args) { // throws FileNotFoundException ó���ϸ� �̷�°�. JVM������ �Ѿ�� �ڵ尡 ����.
		try(FileInputStream fis = new FileInputStream("a.txt")) {
		} catch (IOException e) {
			System.out.println(e); 
		} 
		System.out.println("end");
	}
}
