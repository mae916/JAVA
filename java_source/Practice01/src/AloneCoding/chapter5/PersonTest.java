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
	
	
	System.out.println("나이 : " + person.age);
	System.out.println("이름 : " + person.name);
	System.out.println("결혼여부 : " + person.isMarried);
	System.out.println("자녀 수 : " + person.children);
	System.out.println("몸무게 : " + person.weight);
	System.out.println("키 : " + person.height);
	
	System.out.println();
	
	Person personLee = new Person("김유신", 175, 80);
	System.out.println("이름 : " + personLee.name);
	System.out.println("키 : " + personLee.height);
	System.out.println("몸무게 : " + personLee.weight);
	
	}
}
