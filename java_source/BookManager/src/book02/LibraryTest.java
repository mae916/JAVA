package book02;

public class LibraryTest {
	public static void main(String[]args) {
	BookArrayList bookarraylist = new BookArrayList();
	
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
	

	//�����˻�
	// ��� ���
	System.out.println(); // true
	System.out.println(bookarraylist.isContainsBye); // false
	}
}
