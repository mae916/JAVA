package chapter10.bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	public Shelf() {// 디폴트 생성자를 직접 구현
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
