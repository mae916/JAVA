package chapter10.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥1");
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		
		System.out.println(shelfQueue.deQueue()); //자료형 String으로 반환 되는거라 바로 출력
		System.out.println(shelfQueue.deQueue()); 
		System.out.println(shelfQueue.deQueue()); 
		
		
		//확인용
		Shelf s = (Shelf) shelfQueue;
		System.out.println(s.getCount()); 
		
	}

}
