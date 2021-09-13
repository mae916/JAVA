package book;

import java.time.LocalDate;

public class LibraryTest {
	public static void main(String[]args) {
	BookArrayList bookarraylist = new BookArrayList();
	UserArrayList userarraylist = new UserArrayList();
	
	//Book �ν��Ͻ� ����
	Book book1 = new Book("EM", 1001, "1������ �ѱ��� 365", "�ɿ�ȯ", "���ǽ�", true, " 909-��66��");
	Book book2 = new Book("EM", 1002, "�� ����", "�󽴹� �õ������ǵ�", "�ֺ���", true, "327.04-��754��");
	Book book3 = new Book("EM", 1003, "������ �ູ", "������", "���೪��", false, "813.7-��67��2");
	
	
	
	//Book �߰�
	bookarraylist.addBook(book1);
	bookarraylist.addBook(book2);
	bookarraylist.addBook(book3);
	bookarraylist.showAllBook();
	
	System.out.println("--------------------------------------------------------------------------------");
	
	// Book ����
	bookarraylist.removeBook(book1.bookNumber);
	bookarraylist.showAllBook();
	
	System.out.println("--------------------------------------------------------------------------------");


	// Book ����

	//User ����
	User user1 = new User(12001, "������", "010-0000-0000");
	User user2 = new User(12002, "�ڼ���", "010-1111-1111");
	User user3 = new User(12003, "������", "010-2222-2222");
	User user4 = new User(12004, "�չα�", "010-3333-3333");
	
	//User �߰�
	userarraylist.addUser(user1);
	userarraylist.addUser(user2);
	userarraylist.addUser(user3);
	userarraylist.addUser(user4);
	userarraylist.showAllUser();
	
	System.out.println("--------------------------------------------------------------------------------");
	
	//User ����
	userarraylist.removeUser(user1.getUserId());
	userarraylist.showAllUser();
	
	
	//����Ǽ�
	
	
	
	//����ݳ���¥
	}
}
