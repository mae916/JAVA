package book03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LibraryTest {
		public static void main(String[] args) {

			ArrayList<String> bookList = new ArrayList<>();
			int count = 3;
			Scanner scanner = new Scanner(System.in);
			String bookName;
			String author;
			String publisher;
			
				System.out.println("���� : ");
				bookName = scanner.nextLine();
				bookList.add(bookName);
				
				System.out.println("���ǻ� : ");
				author = scanner.nextLine();
				bookList.add(author);
				
				System.out.println("���� : ");
				publisher = scanner.nextLine();
				bookList.add(publisher);

			for (int i=0; i<bookList.size(); i++) {
				System.out.println(bookList.get(i));
			}

			System.out.println("===========");
			System.out.println(bookList);
		}
}
