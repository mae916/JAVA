package chapter3;

public class Student {
	public static int serialNum; //�Ϸù�ȣ
	public int studentID; //�й�
	public String name; //�̸�
	
	public static int getserialNum() {
		//�������, �ν��Ͻ� �޼��� -> ��� �� �� �ִ°�? X 
		//studentID = 100;
		return serialNum;
	}
	
	public void showInfo() {
		//��������, ���� �޼��� ������ �����Ѱ�? O
		System.out.println("�й� : " + studentID + "�̸� : " + name);
	}
}
