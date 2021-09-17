package final01;

import java.util.HashMap;
import java.util.Scanner;

public class BookManager {
	Scanner scan = new Scanner(System.in);
	HashMap<String, Book> bookList = new HashMap<String, Book>();

	public void Load() {
		bookList.put(1001, new Book(1001, "1페이지 한국사 365", "심용환", "픽피시"));
		bookList.put(1002, new Book(1002, "돈 설명서", "라슈미 시데르슈판드", "솔빛길"));
		bookList.put(1003, new Book(1003, "완전한 행복", "정유정", "은행나무"));
	}

	public void Run() {
		int key = 0;
		while ((key = selectMenu()) != 0) {
			switch (key) {
				case 1:
					listBook();
					break;
				case 2:
					searchBook();
					break;
				case 3:
					addBook();
					break;
				case 4:
					removeBook();
					break;

				default:
					System.out.println("잘못 선택했습니다.");
					break;
			}
		}
		System.out.println("종료합니다...");
	}

	int selectMenu() {
		System.out.println("=================도서 관리 프로그램 입니다================");
		System.out.println("============원하는 명령의 번호를 입력해 주세요============");
		System.out.println("1:도서 목록  2:도서 검색  3:도서 추가  4:도서 삭제  0:종료");
		System.out.println("");
		//System.out.print("");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}

	void listBook() {
		System.out.println("도서 목록");

		int count = bookList.size();
		System.out.println("도서 수: " + count);
		for (Book book : bookList.values()) {
			System.out.println(book.toString());
		}
	}

	void addBook() {
		int bookNumber;
		System.out.print("도서 번호:");
		bookNumber = scan.nextInt();
		if (bookList.containsKey(bookNumber)) {
			System.out.println("이미 존재하는 도서 번호 입니다.");
			return;
		}
		
		String bookName;
		String author;
		String publisher;
		
		System.out.print("도서 제목:");
		bookName = scan.nextLine();
		System.out.print("저자:");
		author = scan.nextLine();
		System.out.println("출판사:");
		publisher = scan.nextLine();
		Book book = new Book(bookNumber, bookName, author, publisher);
		bookList.put(bookNumber, book);
		System.out.println(book.toString() + " 등록 하였습니다.");
	}

	void removeBook() {
		int bookNumber;
		System.out.print("삭제할 도서 번호");
		bookNumber = scan.nextInt();
		if (bookList.containsKey(bookNumber)) {
			bookList.remove(bookNumber);
			System.out.println("삭제하였습니다.");
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}

	void searchBook() {
		int bookNumber;
		System.out.print("검색할 도서번호:");
		bookNumber = scan.nextInt();
		if (bookList.containsKey(bookNumber)) {
			Book book = bookList.get(bookNumber);
			System.out.println("검색 결과>>" + book.toString());
		} else {
			System.out.println("존재하지 않습니다.");
		}
	}
}
