package chapter8_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassEx2 {
	public static void main(String[]args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, 
															IllegalArgumentException, InvocationTargetException { //예외 너무 많음. 꼭 필요한게 아니면 사용X
		Class <Person> cls = Person.class; // 불러오기
		//Person person = cls.newInstance();  곧 없어짐 예전 방식(DeclaredConstructor 사용)
		//System.out.println(person);
		
		//Class param = int.class;
		//Class param = String.class;
		Class[] param = {String.class, int.class};
		Constructor<Person> c = cls.getDeclaredConstructor(param);
		Person person = c.newInstance("이름",10);
		System.out.print(person);
	}
}
