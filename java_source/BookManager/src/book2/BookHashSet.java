package book2;

import java.util.HashSet;
import java.util.Iterator;

public class BookHashSet {
	private HashSet <Book> bookList;
	
	public BookHashSet() {
		bookList = new HashSet<Book>();
	}
	
	// 도서 추가
		public void addBook(Book book) {
			bookList.add(book);
		}
		
		// 도서 삭제
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
			System.out.println(booknumber + "가 존재하지 않습니다.");
			return false;
		}
		
		public void showAllBook() {
			System.out.println(" 등록번호     |     서명     |     저자     |     출판사     |     청구기호 ");
			for(Book book : bookList) {
				System.out.println(book);
			}
		}
}
