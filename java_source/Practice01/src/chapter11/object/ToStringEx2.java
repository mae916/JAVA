package chapter11.object;

class Books {
	int studentID;
	String studentName;
	
	Books(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentID + studentName;
	}
}

public class ToStringEx2 {
	public static void main(String[]args) {
		
	Books book = new Books(200, "이순신");
	System.out.println(book); //참조변수(book)를 넣으면 자동으로 toString() 메서드가 호출됨.
	
	}

}
