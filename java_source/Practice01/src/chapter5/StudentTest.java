package chapter5;

public class StudentTest {
	public static void main(String[]args) {
		Student studentLee = new Student(100, "�̼���");
		studentLee.setKorea("����" , 100);
		studentLee.setMath("����", 80);
		
		Student studentKim = new Student(101, "������");
		studentKim.setKorea("����", 80);
		studentKim.setMath("����", 50);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
