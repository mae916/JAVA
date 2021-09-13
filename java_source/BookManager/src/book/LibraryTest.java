package book;

import java.time.LocalDate;

public class LibraryTest {
	public static void main(String[]args) {
	BookArrayList bookarraylist = new BookArrayList();
	UserArrayList userarraylist = new UserArrayList();
	
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

	//User 정보
	User user1 = new User(12001, "김혜진", "010-0000-0000");
	User user2 = new User(12002, "박서훤", "010-1111-1111");
	User user3 = new User(12003, "이지원", "010-2222-2222");
	User user4 = new User(12004, "손민국", "010-3333-3333");
	
	//User 추가
	userarraylist.addUser(user1);
	userarraylist.addUser(user2);
	userarraylist.addUser(user3);
	userarraylist.addUser(user4);
	userarraylist.showAllUser();
	
	System.out.println("--------------------------------------------------------------------------------");
	
	//User 삭제
	userarraylist.removeUser(user1.getUserId());
	userarraylist.showAllUser();
	
	
	//대출권수
	
	
	
	//대출반납날짜
	}
}
