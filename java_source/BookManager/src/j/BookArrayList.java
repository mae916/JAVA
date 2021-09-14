package j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BookArrayList {
	public static void main(String[] args) {
		Book book1 = new Book("EM", 1001, "1페이지 한국사 365", "심용환", "픽피시", true, " 909-심66ㅇ");
		Book book2 = new Book("EM", 1002, "돈 설명서", "라슈미 시데르슈판드", "솔빛길", true, "327.04-ㅅ754ㄷ");
		Book book3 = new Book("EM", 1003, "완전한 행복", "정유정", "은행나무", false, "813.7-정67ㅇ2");

		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);

		// bookList.stream().map(c -> c.getBookName()).forEach(s -> System.out.println(s));

		System.out.println("================================");
		Scanner scanner = new Scanner(System.in);
		System.out.println("책검색: ");
		String bookSearchKey = scanner.nextLine();
		bookList.stream().map(bookSearchKey-> bookSearchKey.getBookName()).

		// map(c -> c.getBookName()).anyMatch(d->d.getChars(srcBegin, srcEnd, dst,
		// dstBegin)).forEach(s -> System.out.println(s));

	}

}
