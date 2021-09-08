package chapter5;

public class StudentTest {
	public static void main(String[]args) {
		Student studentAhn = new Student();
		studentAhn.studentID = 100;
		studentAhn.studentName = "안승연";
		studentAhn.address = "인천";
		
		Student studentLee = new Student();
		studentLee.studentID = 101;
		studentLee.studentName = "이순신";
		studentLee.address = "서울"; 
		
		studentAhn.showStudentInfo();
		studentLee.showStudentInfo();
		
		System.out.println(studentAhn);
		System.out.println(studentLee);
	}
}
