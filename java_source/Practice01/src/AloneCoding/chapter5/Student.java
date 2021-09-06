package AloneCoding.chapter5;

public class Student {
	String studentName;
	Subject korea;
	Subject math;	
	
	public Student(String name) {
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
}

	public void setKorea(String name, int score, int ranking) {
		korea.setSubjectName(name);
		korea.setScore(score);
		korea.setRanking(ranking);
	}
		
	public void setMath(String name, int score, int ranking) {
		math.setSubjectName(name);
		math.setScore(score);
		math.setRanking(ranking);
	}
	
	public void showInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName+ "학생의 총점은 " + total + "입니다.");
	}

}