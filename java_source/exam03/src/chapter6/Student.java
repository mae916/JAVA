package chapter6;

public class Student {
	private int studentID; // �й�
	private String name; //�л� �̸�
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("�й� : " + studentID + " �̸� : " + name);
	}
	
	
}
