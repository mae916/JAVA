package chapter11.object;

class Student {
	int studentID;
	String studentName;

	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) { //equals ������
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentID == std.studentID) {
				return true;
			}
		}
		return false; 
	}
	
	/*
	public int hashCode() { // �� equals()���� ������ ��(if��) studentID�� ��ȯ�ϸ� ��.
		return studentID;
	}
	*/
	
}

public class EqualsTest {
	public static void main(String[]args) {
		String str1 = new String("test");
		String str2 = new String("test");
		
		//String Ŭ������ equals()�� ������ �Ǿ� �ֱ� ������ �������� ���ٰ� ����.
		System.out.println(str1 == str2); // �ν��Ͻ� �ּ��� ��   
		System.out.println(str1.equals(str2)); //String�� ���ڿ�
		
		System.out.println();
		
		Student std1 = new Student(1001, "�̸�1");
		Student std2 = new Student(1001, "�̸�1");
		
		//������ StudentŬ������ equals() �޼��带 ������ ���־��� ������ �������� ���ٰ� ����.
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		System.out.println();
		
		//StudentŬ������ hashCode()�� ������ ������ �ʾұ⶧����(�ּ�ó����.) �ΰ��� �ؽ��ڵ� ���� �ٸ��ٰ� ������, ���� ������ ���� �ν��Ͻ� ���� ��ȯ�ϴ� identityHashCode ���� ����.(2��° 3��°) 
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(System.identityHashCode(std2));
		
		System.out.println();
		
		//String Ŭ������ hashCode()�� ������ �Ǿ� �ֱ� ������ �������� ���ٰ� ����.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println();
		
		//���� �ν��Ͻ� ���� ��ȯ�ϴ� identityHashCode(���� ������ ��ġ�� �� �� ����.)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	
		
		
		
		
		
	}
}
