package chapter5;

public class Student {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Student (int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setScore(score);
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}

	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentID + "�� " + studentName + " �л��� " + 
		"������ " + total + "���̰�, "  + korea.getSubjectName() + "������ " + 
		korea.getScore() + "��, " + math.getSubjectName() + "������ " + 
		math.getScore() + "�� �Դϴ�." );
	}
}