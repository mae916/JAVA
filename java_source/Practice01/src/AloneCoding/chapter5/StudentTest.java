package AloneCoding.chapter5;

public class StudentTest {
	public static void main(String[]args) {
	Student studentLee = new Student("이순신");
	studentLee.setKorea("국어", 100, 1);
	studentLee.setMath("수학", 100, 1);
	
	studentLee.showInfo();
	}
}
