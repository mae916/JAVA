package d;

import java.io.IOException;
import java.util.Scanner;

public class Manager {
	public static void main(String[] args){
		BookArrayList bookarraylist = new BookArrayList();
		
		
		//Book 인스턴스 생성
		/*
		Book book1 = new Book(1001, "1페이지 한국사 365", "심용환", "픽피시");
		Book book2 = new Book(1002, "돈 설명서", "라슈미 시데르슈판드", "솔빛길");
		Book book3 = new Book(1003, "완전한 행복", "정유정", "은행나무"); */
		
		bookarraylist.addBook(new Book(1001, "1페이지 한국사 365", "심용환", "픽피시"));
		bookarraylist.addBook(new Book(1002, "돈 설명서", "라슈미 시데르슈판드", "솔빛길"));
		bookarraylist.addBook(new Book(1003, "완전한 행복", "정유정", "은행나무")); 
	
		bookarraylist.showAllBook();
		
		System.out.println("--------------------------------------------------------------------------------");
	
		try(
			Scanner sc = new Scanner(System.in)){
			
			while(true) {	
			System.out.println("책 등록번호를 입력해주세요.");
			int bookno = Integer.parseInt(sc.nextLine());
			if(Character.isDigit(bookno) == false){
			}else {
				throw new Exception();
			}
			
			System.out.println("책 제목을 입력해주세요.");
			String bookname = sc.nextLine();
			if(bookname.length() >= 1){
			} else {
				throw new Exception();
			}
			
			System.out.println("책 저자를 입력해주세요.");
			String author = sc.nextLine();
			if(author.length() >= 1){
			} else {
				throw new Exception();
			}
			
			System.out.println("책 출판사를 입력해주세요.");
			String publisher = sc.nextLine();
			if(publisher.length() >= 1){
			} else {
				throw new Exception();
			}
			
			bookarraylist.addBook(new Book(bookno,bookname,author,publisher));
			
			
			System.out.print("입력이 완료되었습니다.");
			bookarraylist.showAllBook();
		}
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("양식이 틀렸습니다.");
		}
		
		for()
		boolean isContains1 = bookarraylist. ("설명서");
		boolean isContains2 = bookarraylist.indexOf ("불행");
		
		System.out.println(isContains1); // true
		System.out.println(bookarraylist.isContains2); // false
	}
}
