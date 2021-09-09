package chapter12.collection.arraylist.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[]args) {
	HashSet<String> set = new HashSet<String>();
	
	boolean b1 = set.add("aaa"); //add의 반환 값은 boolean
	System.out.println(b1);
	
	set.add("bbb");
	set.add("ccc");
	
	System.out.println(set);
	
	boolean b = set.add("aaa");  //중복허용XX
	System.out.println(b);
	}
}
