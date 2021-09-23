package BookManager;

import java.util.ArrayList;
import java.util.Iterator;

public class BookArrayList {
	private ArrayList<Book> bookList;

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
		while (iterator.hasNext()) {
			Book book = iterator.next();
			int getNum = book.getBookNumber();
			if (booknumber == getNum) {
				bookList.remove(book);
				return true;
			}
		}
		System.out.println(booknumber + " (이)가 존재하지 않습니다.");
		return false;
	}

	public void showAllBook() {
		System.out.println(" 등록번호   |    도서명   |    저자   |    출판사   |");
		for (Book book : bookList) {
			System.out.println(book);
		}
	}

	public void showSearchedBook(String type, String title) {
		int cnt = 0;
		System.out.println("--------------------------------------------------------------------------------");
		if (type.equals("0")) {
			System.out.println(" 등록번호   |    도서명   |    저자   |    출판사   |");
			for (Book book : bookList) {
				if (book.getBookName().contains(title)) {
					System.out.println(book);
					cnt++;
				}
			}
		}

		else if (type.equals("1")) {
			System.out.println(" 등록번호   |    도서명   |    저자   |    출판사   |");
			for (Book book : bookList) {
				if (book.getAuthor().contains(title)) {
					System.out.println(book);
					cnt++;
				}
			}
		} else if (type.equals("2")) {
			System.out.println(" 등록번호   |    도서명   |    저자   |    출판사   |");
			for (Book book : bookList) {
				if (book.getPublisher().contains(title)) {
					System.out.println(book);
					cnt++;
				}
			}
		} else {

		}

		if (cnt == 0) {
			System.out.println("검색 결과가 없습니다.");
		}

		System.out.println("--------------------------------------------------------------------------------");

	}

	public Book get(int i) {
		return bookList.get(i);
	}

	public int size() {
		return bookList.size();
	}

	public Book set(int i, Book book) {
		return bookList.set(i, book);
	}
}
