package j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookArrayList {
	public static void main(String[] args) {
		Book book1 = new Book("EM", 1001, "1������ �ѱ��� 365", "�ɿ�ȯ", "���ǽ�", true, " 909-��66��");
		Book book2 = new Book("EM", 1002, "�� ����", "�󽴹� �õ������ǵ�", "�ֺ���", true, "327.04-��754��");
		Book book3 = new Book("EM", 1003, "������ �ູ", "������", "���೪��", false, "813.7-��67��2");

		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		// bookList.stream().map(c -> c.getBookName()).forEach(s -> System.out.println(s));

		System.out.println("================================");
		Scanner scanner = new Scanner(System.in);
		System.out.println("å�˻�: ");
		String bookSearchKey = scanner.nextLine();
		bookList.stream().map(bookSearchKey-> bookSearchKey.getBookName()).

		// map(c -> c.getBookName()).anyMatch(d->d.getChars(srcBegin, srcEnd, dst,
		// dstBegin)).forEach(s -> System.out.println(s));

	}

}
