package chapter5_1;

public class StudentTest {
	public static void main(String[]args) {
		Student studentLee = new Student();
		//studentLee.StudentName = "�̻��";
		studentLee.setStudentName("�̻��");
		
		System.out.println(studentLee.getStudentName());
	}
}
