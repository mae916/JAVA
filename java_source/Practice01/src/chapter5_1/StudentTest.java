package chapter5_1;

public class StudentTest {
	public static void main(String[]args) {
		Student studentLee = new Student();
		//studentLee.StudentName = "이상원";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}
