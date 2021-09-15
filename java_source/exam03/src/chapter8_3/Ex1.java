package chapter8_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Ex1 {
	public static void main(String[]args) {
		Collection<String> list1 = new ArrayList<String>(); // 같은 Collection이더라도 인스턴스가 각각 ArrayList와 HashSet이기 때문에 각각의 메서드들이 호출됨.
		list1.add("테스트1");
		list1.add("테스트2");
		list1.add("테스트1");
		
		Collection<String> list2 = new HashSet<String>();
		list2.add("테스트1");
		list2.add("테스트2");
		list2.add("테스트1");
		
		System.out.println("-----------------------------list1----------------------");
		for(String s : list1) {
			System.out.println(list1);
		}
		
	}
}
