package final02;

import java.util.ArrayList;
import java.util.Iterator;

public class BookArrayList {
		private ArrayList <Book> bookList;
		private boolean checkOut;
		
		public BookArrayList() {
			bookList = new ArrayList<Book>();
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
				System.out.println(booknumber + " (이)가 존재하지 않습니다.");
				return false;
			}
			

			// 도서 검색
			public boolean search(String bookname) {
				Iterator<Book> iterator = bookList.iterator();
				while(iterator.hasNext()) {
					Book book = iterator.next();
					String getName = book.getBookName();
					if(bookname.equals(getName)) {
						if(bookList.indexOf(bookname) > -1) {
							System.out.println("문자열 있음!");
						} else {
				            System.out.println("문자열 없음!");
						} return true;
					}
				}
				return false;
			}

			/*
			// 도서 검색
						public boolean search(String bookname) {
							System.out.println(bookList.contains(bookname));
							System.out.println(bookList.indexOf(bookname));
						}
			*/
			
			public void showAllBook() {
				System.out.println(" 등록번호   |    서명   |    저자   |    출판사   |");
				for(Book book : bookList) {
					System.out.println(book);
				}
			}
			
			public Book get(int i) {
				return bookList.get(i);
			}
			
			public int size() {
				return bookList.size();
			}
			
			public Book set(int i,Book book) {
				return bookList.set(i,book);
			}
}

