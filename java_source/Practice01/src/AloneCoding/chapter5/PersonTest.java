package AloneCoding.chapter5;

public class PersonTest {
	public static void main(String[]args) {
	Person person = new Person();
	person.age = 40;
	person.name = "James";
	person.isMarried = true;
	person.children = 3;
	person.weight = 85.5F;
	person.height = 180.5F;
	
	
	System.out.println("���� : " + person.age);
	System.out.println("�̸� : " + person.name);
	System.out.println("��ȥ���� : " + person.isMarried);
	System.out.println("�ڳ� �� : " + person.children);
	System.out.println("������ : " + person.weight);
	System.out.println("Ű : " + person.height);
	
	System.out.println();
	
	Person personLee = new Person("������", 175, 80);
	System.out.println("�̸� : " + personLee.name);
	System.out.println("Ű : " + personLee.height);
	System.out.println("������ : " + personLee.weight);
	
	}
}
