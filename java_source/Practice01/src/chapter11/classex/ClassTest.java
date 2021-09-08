package chapter11.classex;

public class ClassTest {
	public static void main(String[]args) throws ClassNotFoundException {
		Person person = new Person();
		
		//Class Ŭ������ ������ �� �ִ� 3���� ���
		Class pClass1 = person.getClass(); // getClass()�� Object�� Ŭ����(Person Ŭ������ ��� ��밡��)
		System.out.println(pClass1.getName()); //Person Ŭ���� ������ ������

		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("chapter11.classex.Person");
		System.out.println(pClass3.getName());
		
		
	}
}
