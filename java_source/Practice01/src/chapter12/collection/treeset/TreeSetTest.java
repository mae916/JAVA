package chapter12.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>(); // String�� toString�� �����Ǿ��ִ�.
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");

		System.out.println(tree);
	}

}
