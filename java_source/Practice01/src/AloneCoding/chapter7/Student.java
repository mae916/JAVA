package AloneCoding.chapter7;

public class Student {
	int studentID;
	String name;
	
	Student (int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + "," + name);
	}
	
}
