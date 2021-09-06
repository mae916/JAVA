package chapter7_1;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList; // Subject 참조 자료형, 선언
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); // 대입
		
	}
	
	public void addSubject(String name, int score) { // StudentTest 클래스에서 지정한 값을 처리해서 subjectList(ArrayList배열)에 넣어주는 메소드
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject); // ArrayList에  각각의 과목을 넣어줌.
	}
	
	public  void showStudentInfo() {
		
		int total = 0;
		for(Subject subject : subjectList) { // Subject 참조 자료형의 변수 subject에 위에서 넣은 subjectList에 들어있는 각각의 과목이 대입됨.
			total += subject.getScorePoint();
			
			System.out.println("학생" + studentName + "님의" + subject.getName() + "과목의 성적은 " + subject.getScorePoint() + "입니다.");
		}
		
		System.out.println("학생" + studentName + "님의 총점은 " + total + "입니다.");
	}
}
