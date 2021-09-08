package chapter11.string;

public class StringTest {
	public static void main(String[]args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//각 인스턴스가 생성되었기 때문에 주소 값이 다름
		System.out.println(str1 == str2); 
		
		String str3 = "test";
		String str4 = "test";
		
		//같은 메모리를(문자열 상수) 가리킴. 
		System.out.println(str3 == str4);
		
	}
}
