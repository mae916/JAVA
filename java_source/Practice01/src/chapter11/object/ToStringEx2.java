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
		
	Books book = new Books(200, "�̼���");
	System.out.println(book); //��������(book)�� ������ �ڵ����� toString() �޼��尡 ȣ���.
	
	}

}
