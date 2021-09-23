package BookManager;

import java.util.ArrayList;
import java.util.Iterator;

public class BookArrayList {
	private ArrayList<Book> bookList;

	public BookArrayList() {
		bookList = new ArrayList<Book>();
	}

	// ���� �߰�
	public void addBook(Book book) {
		bookList.add(book);
	}

	// ���� ����
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
		System.out.println(booknumber + " (��)�� �������� �ʽ��ϴ�.");
		return false;
	}

	public void showAllBook() {
		System.out.println(" ��Ϲ�ȣ   |    ������   |    ����   |    ���ǻ�   |");
		for (Book book : bookList) {
			System.out.println(book);
		}
	}

	public void showSearchedBook(String type, String title) {
		int cnt = 0;
		System.out.println("--------------------------------------------------------------------------------");
		if (type.equals("0")) {
			System.out.println(" ��Ϲ�ȣ   |    ������   |    ����   |    ���ǻ�   |");
			for (Book book : bookList) {
				if (book.getBookName().contains(title)) {
					System.out.println(book);
					cnt++;
				}
			}
		}

		else if (type.equals("1")) {
			System.out.println(" ��Ϲ�ȣ   |    ������   |    ����   |    ���ǻ�   |");
			for (Book book : bookList) {
				if (book.getAuthor().contains(title)) {
					System.out.println(book);
					cnt++;
				}
			}
		} else if (type.equals("2")) {
			System.out.println(" ��Ϲ�ȣ   |    ������   |    ����   |    ���ǻ�   |");
			for (Book book : bookList) {
				if (book.getPublisher().contains(title)) {
					System.out.println(book);
					cnt++;
				}
			}
		} else {

		}

		if (cnt == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
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
