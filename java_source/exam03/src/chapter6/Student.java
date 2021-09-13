package chapter6;

public class Student {
	private int studentID; // 학번
	private String name; //학생 이름
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("학번 : " + studentID + " 이름 : " + name);
	}
	
	
}
