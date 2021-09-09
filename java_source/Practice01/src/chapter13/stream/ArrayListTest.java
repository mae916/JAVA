           package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
	public static void main(String[]args) {
		List<String> sList = new ArrayList<String>(); //ArrayList�� ���� �������̽� List �ᵵ ��.
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		
		/*
		for(String s : sList) {
			System.out.println(s);
		}
		*/
		
		Stream<String> stream = sList.stream(); // sList.stream();
		stream.forEach(s->System.out.println(s));//���ٽ����� ���
		
	//foreach �޼��尡 ����Ǹ� �ڷᰡ �Ҹ�ż� ��Ʈ���� �ٽ� �������־����.
		sList.stream().sorted().forEach(s->System.out.println(s));
	//��Ʈ�� ����   ���Ĺ�Ŀ����� ���� ��Ʈ���� �̹� ����  foreach�� ���鼭 s�� ����
	}
}
