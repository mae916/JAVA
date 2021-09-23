package final02;
import java.io.IOException;
import java.util.Scanner;

public class Manager {
	public static void main(String[] args){
		BookArrayList bookarraylist = new BookArrayList();
		Scanner sc = new Scanner(System.in);
		
		//Book �ν��Ͻ� ����
		
		Book book1 = new Book(1001, "1������ �ѱ��� 365", "�ɿ�ȯ", "���ǽ�");
		Book book2 = new Book(1002, "�� ����", "�󽴹� �õ������ǵ�", "�ֺ���");
		Book book3 = new Book(1003, "������ �ູ", "������", "���೪��"); 
		
		/*
		bookarraylist.addBook(new Book(1001, "1������ �ѱ��� 365", "�ɿ�ȯ", "���ǽ�"));
		bookarraylist.addBook(new Book(1002, "�� ����", "�󽴹� �õ������ǵ�", "�ֺ���"));
		bookarraylist.addBook(new Book(1003, "������ �ູ", "������", "���೪��")); */
		
		bookarraylist.addBook(book1);
		bookarraylist.addBook(book2);
		bookarraylist.addBook(book3);
		System.out.println("--------------------------------------------------------------------------------");
		
	while(true){
			System.out.println("���񽺸� ����ּ���!");
			System.out.println("�߰�0     ����1       ����2     �˻� 3     ���4");
			System.out.println("--------------------------------------------------------------------------------");
			
	String select = sc.nextLine();
	if(select.equals("0")) { /** å �߰� S **/
		try{
			while(true) {
			System.out.println("å ��Ϲ�ȣ�� �Է����ּ���.");
			int bookno = Integer.parseInt(sc.nextLine());
			if(Character.isDigit(bookno) == false || bookno < 58 && bookno>47){
			}else {
				throw new Exception();
			}
			
			System.out.println("å ������ �Է����ּ���.");
			String bookname = sc.nextLine();
			if(bookname.length() >= 1){
			} else {
				throw new Exception();
			}
			
			System.out.println("å ���ڸ� �Է����ּ���.");
			String author = sc.nextLine();
			if(author.length() >= 1){
			} else {
				throw new Exception();
			}
			
			System.out.println("å ���ǻ縦 �Է����ּ���.");
			String publisher = sc.nextLine();
			if(publisher.length() >= 1){
			} else {
				throw new Exception();
			}

			bookarraylist.addBook(new Book(bookno,bookname,author,publisher));
			
			System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
			System.out.println("--------------------------------------------------------------------------------");
			bookarraylist.showAllBook();
			System.out.println("--------------------------------------------------------------------------------");
			
			System.out.println("��� �Է� �Ͻðڽ��ϱ�? Y/N ");
			String recycle = sc.nextLine();
			if(!recycle.equals("Y") && !recycle.equals("y")) {
				if(recycle.equals("N") || recycle.equals("n")) {
					System.out.println("å �߰� ���񽺸� �����մϴ�.\n");
					break;
				}
				if(recycle.length()<1){
					System.out.println("������ �ȵ˴ϴ�!!\n");
					break;
				}
				throw new Exception();
			}
		}
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("����� Ʋ�Ƚ��ϴ�.");
			System.out.println("--------------------------------------------------------------------------------");
		} /** å �߰� E **/
		
	} else if(select.equals("1")) {	/** å ���� S **/
		try {
			while(true) {
				System.out.println("������ å�� �������ּ���");
				System.out.println("--------------------------------------------------------------------------------");
				bookarraylist.showAllBook();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("������ å ��Ϲ�ȣ�� �Է����ּ���");
				int delBook = Integer.parseInt(sc.nextLine());
				if(Character.isDigit(delBook) == false){
					bookarraylist.removeBook(delBook);
				}else if(delBook < 58 && delBook>47) {
					bookarraylist.removeBook(delBook);
				}else {
					throw new Exception();
				}
				System.out.println("��� ���� �Ͻðڽ��ϱ�? Y/N ");
				String recycle = sc.nextLine();
				if(!recycle.equals("Y") && !recycle.equals("y")) {
					if(recycle.equals("N") || recycle.equals("n")) {
						System.out.println("å ���� ���񽺸� �����մϴ�.\n");
						break;
					}
					if(recycle.length()<1){
						System.out.println("������ �ȵ˴ϴ�!!\n");
						break;
					}
					throw new Exception();
				}
			}		
		} catch(Exception e) {
			System.out.println("����� Ʋ�Ƚ��ϴ�.");
			System.out.println("--------------------------------------------------------------------------------");
		} /** å ���� E **/
		
	} else if(select.equals("2")) { /** å ���� S**/
		try {
			while(true) {
				bookarraylist.showAllBook();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("�����Ͻ� å�� �������ּ���");
				int change = sc.nextInt();
				sc.nextLine();
				change--;
				System.out.println(bookarraylist.get(change));
				System.out.println("* ���泻���� �Է����ּ���. *");
				System.out.println("å ��Ϲ�ȣ�� �Է����ּ���.");
				int bookno = Integer.parseInt(sc.nextLine());
				if(Character.isDigit(bookno) == false){
				}else if(bookno < 58 && bookno>47) {
				}else {
					throw new Exception();
				}
				
				System.out.println("å ������ �Է����ּ���.");
				String bookname = sc.nextLine();
				if(bookname.length() >= 1){
				} else {
					throw new Exception();
				}
				
				System.out.println("å ���ڸ� �Է����ּ���.");
				String author = sc.nextLine();
				if(author.length() >= 1){
				} else {
					throw new Exception();
				}
				
				System.out.println("å ���ǻ縦 �Է����ּ���.");
				String publisher = sc.nextLine();
				if(publisher.length() >= 1){
				} else {
					throw new Exception();
				}
		
				bookarraylist.set(change, (new Book(bookno,bookname,author,publisher)));
				System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
				System.out.println("--------------------------------------------------------------------------------");
				
				System.out.println("��� �Է� �Ͻðڽ��ϱ�? Y/N ");
				String recycle = sc.nextLine();
				if(!recycle.equals("Y") && !recycle.equals("y")) {
					if(recycle.equals("N") || recycle.equals("n")) {
						System.out.println("å ���� ���񽺸� �����մϴ�.");
						break;
					}
					if(recycle.length()<1){
						System.out.println("������ �ȵ˴ϴ�!!");
						break;
					}
					throw new Exception();
				}
			}
	
			}catch(Exception e) {
				System.out.println("����� Ʋ�Ƚ��ϴ�.");
				System.out.println("--------------------------------------------------------------------------------");
			} /** å ���� E **/
	} else if(select.equals("3")) { /** å �˻� **/
		try {
			while(true) {
				bookarraylist.showAllBook();
				System.out.println("å ������ �Է����ּ���");
				String Search = sc.nextLine();
				if(bookarraylist.search(Search)) {
					bookarraylist.search(Search);
				} else {
					System.out.println("�������� �ʴ� ���� �Դϴ�.");
				}
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	} else if(select.equals("4")) { /** å ��� S **/
		try{
			while(true) {
				System.out.println("--------------------------------------------------------------------------------");
				bookarraylist.showAllBook();
				System.out.println("--------------------------------------------------------------------------------");
				
				System.out.println("���� �ϽǷ��� q�� �Է����ּ���!");
				String listrecycle = sc.nextLine();
				if(listrecycle.equals("Q") || listrecycle.equals("q")) {
					throw new Exception();
				}
			}
		}catch(Exception e) {
			System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
			System.out.println("--------------------------------------------------------------------------------");
		} /** å ��� E **/
		
	} else { /** ���� ���� ó�� **/
		try {
			System.out.println("�Է��Ͻ� ���񽺴� �����ϴ�!!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}
	}
}