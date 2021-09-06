package chapter5;

public class StudentTest {
	public static void main(String[]args) {
		Student studentLee = new Student(100, "이순신");
		studentLee.setKorea("국어" , 100);
		studentLee.setMath("수학", 80);
		
		Student studentKim = new Student(101, "김유신");
		studentKim.setKorea("국어", 80);
		studentKim.setMath("수학", 50);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
