package BookManager;

import java.io.IOException;
import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		BookArrayList bookarraylist = new BookArrayList();
		Scanner sc = new Scanner(System.in);

		// Book �ν��Ͻ� ����

		bookarraylist.addBook(new Book(1001, "1������ �ѱ��� 365", "�ɿ�ȯ", "���ǽ�"));
		bookarraylist.addBook(new Book(1002, "�� ����", "�󽴹� �õ������ǵ�", "�ֺ���"));
		bookarraylist.addBook(new Book(1003, "������ �ູ", "������", "���೪��"));
		bookarraylist.addBook(new Book(1004, "���� ���� JSP �� ���α׷���", "�۹̿�", "�Ѻ���ī����"));
		bookarraylist.addBook(new Book(1005, "�޷���Ʈ �� ��ȭ��", "�̹̿�", "���丮����"));
		bookarraylist.addBook(new Book(1006, "�̷��� ��", "������", "��������"));
		bookarraylist.addBook(new Book(1007, "������ ������", "��ȣ��", "����������"));
		bookarraylist.addBook(new Book(1008, "���� ī�ױ� �ΰ� �����", "���� ī�ױ�", "��������"));
		bookarraylist.addBook(new Book(1009, "���̾�", "�츣�� �켼", "������"));
		bookarraylist.addBook(new Book(1010, "�ۺ����� �ʴ´�", "�Ѱ�", "���е���"));
		System.out.println("--------------------------------------------------------------------------------");

		while (true) {
			System.out.println("���񽺸� ����ּ���!");
			System.out.println("���� �߰�: 0 \t���� ����: 1 \t���� ����: 2 \t���� ���: 3 \t���� �˻�: 4");
			System.out.println("--------------------------------------------------------------------------------");

			String select = sc.nextLine();
			if (select.equals("0")) {
				/** å �߰� S **/
				try {
					while (true) {
						System.out.println("å ��Ϲ�ȣ�� �Է����ּ���.");
						int bookno = Integer.parseInt(sc.nextLine());
						if (Character.isDigit(bookno) == false || bookno < 58 && bookno > 47) {
						} else {
							throw new Exception();
						}

						System.out.println("å ������ �Է����ּ���.");
						String bookname = sc.nextLine();
						if (bookname.length() >= 1) {
						} else {
							throw new Exception();
						}

						System.out.println("å ���ڸ� �Է����ּ���.");
						String author = sc.nextLine();
						if (author.length() >= 1) {
						} else {
							throw new Exception();
						}

						System.out.println("å ���ǻ縦 �Է����ּ���.");
						String publisher = sc.nextLine();
						if (publisher.length() >= 1) {
						} else {
							throw new Exception();
						}

						bookarraylist.addBook(new Book(bookno, bookname, author, publisher));

						System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
						System.out.println("--------------------------------------------------------------------------------");
						bookarraylist.showAllBook();
						System.out.println("--------------------------------------------------------------------------------");

						System.out.println("��� �Է� �Ͻðڽ��ϱ�? Y/N ");
						String recycle = sc.nextLine();
						if (!recycle.equals("Y") && !recycle.equals("y")) {
							if (recycle.equals("N") || recycle.equals("n")) {
								System.out.println("å �߰� ���񽺸� �����մϴ�.\n");
								break;
							}
							if (recycle.length() < 1) {
								System.out.println("������ �ȵ˴ϴ�!!\n");
								break;
							}
							throw new Exception();
						}
					}

				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					System.out.println("����� Ʋ�Ƚ��ϴ�.");
					System.out.println("--------------------------------------------------------------------------------");
				} /** å �߰� E **/

			} else if (select.equals("1")) {
				/** å ���� S **/
				try {
					while (true) {
						System.out.println("������ å�� �������ּ���");
						System.out.println("--------------------------------------------------------------------------------");
						bookarraylist.showAllBook();
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("������ å ��Ϲ�ȣ�� �Է����ּ���");
						int delBook = Integer.parseInt(sc.nextLine());
						if (Character.isDigit(delBook) == false) {
							bookarraylist.removeBook(delBook);
						} else if (delBook < 58 && delBook > 47) {
							bookarraylist.removeBook(delBook);
						} else {
							throw new Exception();
						}
						System.out.println("��� ���� �Ͻðڽ��ϱ�? Y/N ");
						String recycle = sc.nextLine();
						if (!recycle.equals("Y") && !recycle.equals("y")) {
							if (recycle.equals("N") || recycle.equals("n")) {
								System.out.println("å ���� ���񽺸� �����մϴ�.\n");
								break;
							}
							if (recycle.length() < 1) {
								System.out.println("������ �ȵ˴ϴ�!!\n");
								break;
							}
							throw new Exception();
						}
					}
				} catch (Exception e) {
					System.out.println("����� Ʋ�Ƚ��ϴ�.");
					System.out.println("--------------------------------------------------------------------------------");
				} /** å ���� E **/

			} else if (select.equals("2")) {
				/** å ���� S **/
				try {
					while (true) {
						bookarraylist.showAllBook();
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("�����Ͻ� å ����� �Է����ּ���");
						int change = sc.nextInt();
						sc.nextLine();
						change--;
						System.out.println(bookarraylist.get(change));
						System.out.println("* ���泻���� �Է����ּ���. *");
						System.out.println("å ��Ϲ�ȣ�� �Է����ּ���.");
						int bookno = Integer.parseInt(sc.nextLine());
						if (Character.isDigit(bookno) == false) {
						} else if (bookno < 58 && bookno > 47) {
						} else {
							throw new Exception();
						}

						System.out.println("å ������ �Է����ּ���.");
						String bookname = sc.nextLine();
						if (bookname.length() >= 1) {
						} else {
							throw new Exception();
						}

						System.out.println("å ���ڸ� �Է����ּ���.");
						String author = sc.nextLine();
						if (author.length() >= 1) {
						} else {
							throw new Exception();
						}

						System.out.println("å ���ǻ縦 �Է����ּ���.");
						String publisher = sc.nextLine();
						if (publisher.length() >= 1) {
						} else {
							throw new Exception();
						}

						bookarraylist.set(change, (new Book(bookno, bookname, author, publisher)));
						System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
						System.out.println("--------------------------------------------------------------------------------");

						System.out.println("��� �Է� �Ͻðڽ��ϱ�? Y/N ");
						String recycle = sc.nextLine();
						if (!recycle.equals("Y") && !recycle.equals("y")) {
							if (recycle.equals("N") || recycle.equals("n")) {
								System.out.println("å ���� ���񽺸� �����մϴ�.");
								break;
							}
							if (recycle.length() < 1) {
								System.out.println("������ �ȵ˴ϴ�!!");
								break;
							}
							throw new Exception();
						}
					}

				} catch (Exception e) {
					System.out.println("����� Ʋ�Ƚ��ϴ�.");
					System.out.println("--------------------------------------------------------------------------------");
				} /** å ���� E **/

			} else if (select.equals("3")) {
				/** å ��� S **/
				try {
					while (true) {
						System.out.println("--------------------------------------------------------------------------------");
						bookarraylist.showAllBook();
						System.out.println("--------------------------------------------------------------------------------");

						System.out.println("���� �ϽǷ��� q�� �Է����ּ���!");
						String listrecycle = sc.nextLine();
						if (listrecycle.equals("Q") || listrecycle.equals("q")) {
							throw new Exception();
						}
					}
				} catch (Exception e) {
					System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
					System.out.println("--------------------------------------------------------------------------------");
				} /** å ��� E **/

			} else if (select.equals("4")) {
				/** å �˻� S **/
				try {
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("�������� �˻��Ͻðڽ��ϱ�");
					System.out.println("������0 \t����1 \t���ǻ�2");
					System.out.println("--------------------------------------------------------------------------------");

					String type = sc.nextLine();

					System.out.println("--------------------------------------------------------------------------------");
					if (type.equals("0")) {
						System.out.println("�˻��� �������� �Է����ּ���");
					} else if (type.equals("1")) {
						System.out.println("�˻��� ���ڸ� �Է����ּ���");
					} else if (type.equals("2")) {
						System.out.println("�˻��� ���ǻ縦 �Է����ּ���");
					} else {
						System.out.println("�Է��Ͻ� ���񽺴� �����ϴ�!!");
						System.out.println("--------------------------------------------------------------------------------");
						type = "-1";
					}

					if (type.compareTo("-1") != 0) {
						String title = "";
						System.out.println("--------------------------------------------------------------------------------");
						title = sc.nextLine();

						bookarraylist.showSearchedBook(type, title);
					}
					 System.out.println("��� ã���ðڽ��ϱ�? Y/N ");
						String recycle = sc.nextLine();
						if(!recycle.equals("Y") && !recycle.equals("y")) {
							if(recycle.equals("N") || recycle.equals("n")) {
								System.out.println("å �˻� ���񽺸� �����մϴ�.");
								break;
							}
							if(recycle.length()<1){
								System.out.println("������ �ȵ˴ϴ�!!");
								break;
							}
							throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("�ʱ�ȭ������ ���ư��ϴ�.");
					System.out.println("--------------------------------------------------------------------------------");
				}/** å �˻� E **/
			}

			/** ���� ���� ó�� **/
			else {
				try {
					System.out.println("�Է��Ͻ� ���񽺴� �����ϴ�!!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}