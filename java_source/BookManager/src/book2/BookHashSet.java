package book2;

import java.util.HashSet;
import java.util.Iterator;

public class BookHashSet {
	private HashSet <Book> bookList;
	
	public BookHashSet() {
		bookList = new HashSet<Book>();
	}
	
	// ���� �߰�
		public void addBook(Book book) {
			bookList.add(book);
		}
		
		// ���� ����
		public boolean removeBook(int booknumber) {
			Iterator<Book> iterator = bookList.iterator();
			while(iterator.hasNext()) {
				Book book = iterator.next();
				int getNum = book.getBookNumber();
				if(booknumber == getNum) {
					bookList.remove(book);
					return true;
				}
			}
			System.out.println(booknumber + "�� �������� �ʽ��ϴ�.");
			return false;
		}
		
		public void showAllBook() {
			System.out.println(" ��Ϲ�ȣ     |     ����     |     ����     |     ���ǻ�     |     û����ȣ ");
			for(Book book : bookList) {
				System.out.println(book);
			}
		}
}
