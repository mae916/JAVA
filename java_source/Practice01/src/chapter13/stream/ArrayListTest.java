           package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
	public static void main(String[]args) {
		List<String> sList = new ArrayList<String>(); //ArrayList의 상위 인터페이스 List 써도 됨.
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		
		/*
		for(String s : sList) {
			System.out.println(s);
		}
		*/
		
		Stream<String> stream = sList.stream(); // sList.stream();
		stream.forEach(s->System.out.println(s));//람다식으로 출력
		
	//foreach 메서드가 수행되면 자료가 소모돼서 스트림을 다시 생성해주어야함.
		sList.stream().sorted().forEach(s->System.out.println(s));
	//스트림 생성   정렬방식에대한 정의 스트링은 이미 생성  foreach가 돌면서 s에 대입
	}
}
