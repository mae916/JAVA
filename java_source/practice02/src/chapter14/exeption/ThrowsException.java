 package chapter14.exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException { //미뤘기 때문에
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c; 
	}
	
	 public static void main(String[]args) {
		 ThrowsException ex = new ThrowsException(); // 쓰는 쪽에서 처리해 줘야함
		 try {
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { //Exception은 최상위 클래스이기 때문에 모든 Exception을 잡아줌. 어떤 Exception을 써야 할지 모르겠다 할때 써도 됨. 대신 이렇게 맨 마지막에 써줘야함. 
			System.out.println(e);
		}
		 System.out.println("end");
	 }
}
