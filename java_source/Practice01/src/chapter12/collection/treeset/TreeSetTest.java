package chapter12.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>(); // String엔 toString이 구현되어있다.
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");

		System.out.println(tree);
	}

}
