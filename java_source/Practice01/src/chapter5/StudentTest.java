package chapter5;

public class StudentTest {
	public static void main(String[]args) {
		Student studentAhn = new Student();
		studentAhn.studentID = 100;
		studentAhn.studentName = "�Ƚ¿�";
		studentAhn.address = "��õ";
		
		Student studentLee = new Student();
		studentLee.studentID = 101;
		studentLee.studentName = "�̼���";
		studentLee.address = "����"; 
		
		studentAhn.showStudentInfo();
		studentLee.showStudentInfo();
		
		System.out.println(studentAhn);
		System.out.println(studentLee);
	}
}
