package chapter10.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("�¹���1");
		shelfQueue.enQueue("�¹���2");
		shelfQueue.enQueue("�¹���3");
		
		System.out.println(shelfQueue.deQueue()); //�ڷ��� String���� ��ȯ �Ǵ°Ŷ� �ٷ� ���
		System.out.println(shelfQueue.deQueue()); 
		System.out.println(shelfQueue.deQueue()); 
		
		
		//Ȯ�ο�
		Shelf s = (Shelf) shelfQueue;
		System.out.println(s.getCount()); 
		
	}

}
