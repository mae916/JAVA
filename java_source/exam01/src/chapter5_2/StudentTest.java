package chapter5_2;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.serialNum = 1000;
		
		System.out.println("s1.serialNum : " + s1.serialNum);
		System.out.println("s2.serialNum : " + s2.serialNum);
		
		s2.serialNum = 2000;
		
		System.out.println("s1.serialNum : " + s1.serialNum);
		System.out.println("s2.serialNum : " + s2.serialNum);
	}
}