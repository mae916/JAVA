 package chapter10.bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // shelf에서 꺼내는건데 getShelf는 가지고와서 그냥 보는거고(참조), 지금 하려는건 아예 꺼내는것. 배열에서는 삭제됨.
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
