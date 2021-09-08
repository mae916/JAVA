package chapter11.object;

class Student {
	int studentID;
	String studentName;

	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { //equals 재정의
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentID == std.studentID) {
				return true;
			}
		}
		return false; 
	}
	
	/*
	public int hashCode() { // 위 equals()에서 재정의 한(if절) studentID를 반환하면 됨.
		return studentID;
	}
	*/
	
}

public class EqualsTest {
	public static void main(String[]args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		//String 클래스에 equals()는 재정의 되어 있기 때문에 논리적으로 같다고 나옴.
		System.out.println(str1 == str2); // 인스턴스 주소의 값   
		System.out.println(str1.equals(str2)); //String의 문자열
		
		System.out.println();
		
		Student std1 = new Student(1001, "이름1");
		Student std2 = new Student(1001, "이름1");
		
		//위에서 Student클래스의 equals() 메서드를 재정의 해주었기 때문에 논리적으로 같다고 나옴.
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		System.out.println();
		
		//Student클래스의 hashCode()는 재정의 해주지 않았기때문에(주석처리됨.) 두개의 해쉬코드 값이 다르다고 나오고, 같은 이유로 실제 인스턴스 값을 반환하는 identityHashCode 값은 같다.(2번째 3번째) 
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(System.identityHashCode(std2));
		
		System.out.println();
		
		//String 클래스에 hashCode()는 재정의 되어 있기 때문에 논리적으로 같다고 나옴.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println();
		
		//실제 인스턴스 값을 반환하는 identityHashCode(실제 물리적 위치를 알 수 있음.)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	
		
		
		
		
		
	}
}
