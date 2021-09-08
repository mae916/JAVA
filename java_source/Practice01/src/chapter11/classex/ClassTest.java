package chapter11.classex;

public class ClassTest {
	public static void main(String[]args) throws ClassNotFoundException {
		Person person = new Person();
		
		//Class 클래스를 가져올 수 있는 3가지 방법
		Class pClass1 = person.getClass(); // getClass()는 Object의 클래스(Person 클래스에 없어도 사용가능)
		System.out.println(pClass1.getName()); //Person 클래스 네임을 가져옴

		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("chapter11.classex.Person");
		System.out.println(pClass3.getName());
		
		
	}
}
