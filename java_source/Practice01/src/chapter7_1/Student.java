package chapter7_1;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList; // Subject ���� �ڷ���, ����
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); // ����
		
	}
	
	public void addSubject(String name, int score) { // StudentTest Ŭ�������� ������ ���� ó���ؼ� subjectList(ArrayList�迭)�� �־��ִ� �޼ҵ�
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject); // ArrayList��  ������ ������ �־���.
	}
	
	public  void showStudentInfo() {
		
		int total = 0;
		for(Subject subject : subjectList) { // Subject ���� �ڷ����� ���� subject�� ������ ���� subjectList�� ����ִ� ������ ������ ���Ե�.
			total += subject.getScorePoint();
			
			System.out.println("�л�" + studentName + "����" + subject.getName() + "������ ������ " + subject.getScorePoint() + "�Դϴ�.");
		}
		
		System.out.println("�л�" + studentName + "���� ������ " + total + "�Դϴ�.");
	}
}
