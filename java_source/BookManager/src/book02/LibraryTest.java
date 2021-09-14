package book02;

public class LibraryTest {
	public static void main(String[]args) {
	BookArrayList bookarraylist = new BookArrayList();
	
	//Book 인스턴스 생성
	Book book1 = new Book("EM", 1001, "1페이지 한국사 365", "심용환", "픽피시", true, " 909-심66ㅇ");
	Book book2 = new Book("EM", 1002, "돈 설명서", "라슈미 시데르슈판드", "솔빛길", true, "327.04-ㅅ754ㄷ");
	Book book3 = new Book("EM", 1003, "완전한 행복", "정유정", "은행나무", false, "813.7-정67ㅇ2");
	
	//Book 추가
	bookarraylist.addBook(book1);
	bookarraylist.addBook(book2);
	bookarraylist.addBook(book3);
	bookarraylist.showAllBook();
	
	System.out.println("--------------------------------------------------------------------------------");
	
	// Book 삭제
	bookarraylist.removeBook(book1.bookNumber);
	bookarraylist.showAllBook();
	
	System.out.println("--------------------------------------------------------------------------------");

	// Book 수정
	

	//도서검색
	// 결과 출력
	System.out.println(); // true
	System.out.println(bookarraylist.isContainsBye); // false
	}
}
