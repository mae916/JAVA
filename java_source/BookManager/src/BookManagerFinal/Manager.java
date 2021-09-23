package BookManager;

import java.io.IOException;
import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		BookArrayList bookarraylist = new BookArrayList();
		Scanner sc = new Scanner(System.in);

		// Book 인스턴스 생성

		bookarraylist.addBook(new Book(1001, "1페이지 한국사 365", "심용환", "픽피시"));
		bookarraylist.addBook(new Book(1002, "돈 설명서", "라슈미 시데르슈판드", "솔빛길"));
		bookarraylist.addBook(new Book(1003, "완전한 행복", "정유정", "은행나무"));
		bookarraylist.addBook(new Book(1004, "쉽게 배우는 JSP 웹 프로그래밍", "송미영", "한빛아카데미"));
		bookarraylist.addBook(new Book(1005, "달러구트 꿈 백화점", "이미예", "팩토리나인"));
		bookarraylist.addBook(new Book(1006, "미래의 부", "이지성", "차이정원"));
		bookarraylist.addBook(new Book(1007, "불편한 편의점", "김호연", "나무옆의자"));
		bookarraylist.addBook(new Book(1008, "데일 카네기 인간 관계론", "데일 카네기", "현대지성"));
		bookarraylist.addBook(new Book(1009, "데미안", "헤르만 헤세", "민음사"));
		bookarraylist.addBook(new Book(1010, "작별하지 않는다", "한강", "문학동네"));
		System.out.println("--------------------------------------------------------------------------------");

		while (true) {
			System.out.println("서비스를 골라주세요!");
			System.out.println("도서 추가: 0 \t도서 삭제: 1 \t도서 변경: 2 \t도서 목록: 3 \t도서 검색: 4");
			System.out.println("--------------------------------------------------------------------------------");

			String select = sc.nextLine();
			if (select.equals("0")) {
				/** 책 추가 S **/
				try {
					while (true) {
						System.out.println("책 등록번호를 입력해주세요.");
						int bookno = Integer.parseInt(sc.nextLine());
						if (Character.isDigit(bookno) == false || bookno < 58 && bookno > 47) {
						} else {
							throw new Exception();
						}

						System.out.println("책 제목을 입력해주세요.");
						String bookname = sc.nextLine();
						if (bookname.length() >= 1) {
						} else {
							throw new Exception();
						}

						System.out.println("책 저자를 입력해주세요.");
						String author = sc.nextLine();
						if (author.length() >= 1) {
						} else {
							throw new Exception();
						}

						System.out.println("책 출판사를 입력해주세요.");
						String publisher = sc.nextLine();
						if (publisher.length() >= 1) {
						} else {
							throw new Exception();
						}

						bookarraylist.addBook(new Book(bookno, bookname, author, publisher));

						System.out.println("입력이 완료되었습니다.");
						System.out.println("--------------------------------------------------------------------------------");
						bookarraylist.showAllBook();
						System.out.println("--------------------------------------------------------------------------------");

						System.out.println("계속 입력 하시겠습니까? Y/N ");
						String recycle = sc.nextLine();
						if (!recycle.equals("Y") && !recycle.equals("y")) {
							if (recycle.equals("N") || recycle.equals("n")) {
								System.out.println("책 추가 서비스를 종료합니다.\n");
								break;
							}
							if (recycle.length() < 1) {
								System.out.println("공란은 안됩니다!!\n");
								break;
							}
							throw new Exception();
						}
					}

				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					System.out.println("양식이 틀렸습니다.");
					System.out.println("--------------------------------------------------------------------------------");
				} /** 책 추가 E **/

			} else if (select.equals("1")) {
				/** 책 삭제 S **/
				try {
					while (true) {
						System.out.println("삭제할 책을 선택해주세요");
						System.out.println("--------------------------------------------------------------------------------");
						bookarraylist.showAllBook();
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("삭제할 책 등록번호를 입력해주세요");
						int delBook = Integer.parseInt(sc.nextLine());
						if (Character.isDigit(delBook) == false) {
							bookarraylist.removeBook(delBook);
						} else if (delBook < 58 && delBook > 47) {
							bookarraylist.removeBook(delBook);
						} else {
							throw new Exception();
						}
						System.out.println("계속 삭제 하시겠습니까? Y/N ");
						String recycle = sc.nextLine();
						if (!recycle.equals("Y") && !recycle.equals("y")) {
							if (recycle.equals("N") || recycle.equals("n")) {
								System.out.println("책 삭제 서비스를 종료합니다.\n");
								break;
							}
							if (recycle.length() < 1) {
								System.out.println("공란은 안됩니다!!\n");
								break;
							}
							throw new Exception();
						}
					}
				} catch (Exception e) {
					System.out.println("양식이 틀렸습니다.");
					System.out.println("--------------------------------------------------------------------------------");
				} /** 책 삭제 E **/

			} else if (select.equals("2")) {
				/** 책 변경 S **/
				try {
					while (true) {
						bookarraylist.showAllBook();
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("변경하실 책 행렬을 입력해주세요");
						int change = sc.nextInt();
						sc.nextLine();
						change--;
						System.out.println(bookarraylist.get(change));
						System.out.println("* 변경내용을 입력해주세요. *");
						System.out.println("책 등록번호를 입력해주세요.");
						int bookno = Integer.parseInt(sc.nextLine());
						if (Character.isDigit(bookno) == false) {
						} else if (bookno < 58 && bookno > 47) {
						} else {
							throw new Exception();
						}

						System.out.println("책 제목을 입력해주세요.");
						String bookname = sc.nextLine();
						if (bookname.length() >= 1) {
						} else {
							throw new Exception();
						}

						System.out.println("책 저자를 입력해주세요.");
						String author = sc.nextLine();
						if (author.length() >= 1) {
						} else {
							throw new Exception();
						}

						System.out.println("책 출판사를 입력해주세요.");
						String publisher = sc.nextLine();
						if (publisher.length() >= 1) {
						} else {
							throw new Exception();
						}

						bookarraylist.set(change, (new Book(bookno, bookname, author, publisher)));
						System.out.println("입력이 완료되었습니다.");
						System.out.println("--------------------------------------------------------------------------------");

						System.out.println("계속 입력 하시겠습니까? Y/N ");
						String recycle = sc.nextLine();
						if (!recycle.equals("Y") && !recycle.equals("y")) {
							if (recycle.equals("N") || recycle.equals("n")) {
								System.out.println("책 변경 서비스를 종료합니다.");
								break;
							}
							if (recycle.length() < 1) {
								System.out.println("공란은 안됩니다!!");
								break;
							}
							throw new Exception();
						}
					}

				} catch (Exception e) {
					System.out.println("양식이 틀렸습니다.");
					System.out.println("--------------------------------------------------------------------------------");
				} /** 책 변경 E **/

			} else if (select.equals("3")) {
				/** 책 목록 S **/
				try {
					while (true) {
						System.out.println("--------------------------------------------------------------------------------");
						bookarraylist.showAllBook();
						System.out.println("--------------------------------------------------------------------------------");

						System.out.println("종료 하실려면 q를 입력해주세요!");
						String listrecycle = sc.nextLine();
						if (listrecycle.equals("Q") || listrecycle.equals("q")) {
							throw new Exception();
						}
					}
				} catch (Exception e) {
					System.out.println("초기화면으로 돌아갑니다.");
					System.out.println("--------------------------------------------------------------------------------");
				} /** 책 목록 E **/

			} else if (select.equals("4")) {
				/** 책 검색 S **/
				try {
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("무엇으로 검색하시겠습니까");
					System.out.println("도서명0 \t저자1 \t출판사2");
					System.out.println("--------------------------------------------------------------------------------");

					String type = sc.nextLine();

					System.out.println("--------------------------------------------------------------------------------");
					if (type.equals("0")) {
						System.out.println("검색할 도서명을 입력해주세요");
					} else if (type.equals("1")) {
						System.out.println("검색할 저자를 입력해주세요");
					} else if (type.equals("2")) {
						System.out.println("검색할 출판사를 입력해주세요");
					} else {
						System.out.println("입력하신 서비스는 없습니다!!");
						System.out.println("--------------------------------------------------------------------------------");
						type = "-1";
					}

					if (type.compareTo("-1") != 0) {
						String title = "";
						System.out.println("--------------------------------------------------------------------------------");
						title = sc.nextLine();

						bookarraylist.showSearchedBook(type, title);
					}
					 System.out.println("계속 찾으시겠습니까? Y/N ");
						String recycle = sc.nextLine();
						if(!recycle.equals("Y") && !recycle.equals("y")) {
							if(recycle.equals("N") || recycle.equals("n")) {
								System.out.println("책 검색 서비스를 종료합니다.");
								break;
							}
							if(recycle.length()<1){
								System.out.println("공란은 안됩니다!!");
								break;
							}
							throw new Exception();
					}
				} catch (Exception e) {
					System.out.println("초기화면으로 돌아갑니다.");
					System.out.println("--------------------------------------------------------------------------------");
				}/** 책 검색 E **/
			}

			/** 없는 서비스 처리 **/
			else {
				try {
					System.out.println("입력하신 서비스는 없습니다!!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}