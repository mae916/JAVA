package book;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
	
public class Date {
	
		LocalDate currentDate = LocalDate.now();
		int year = currentDate.getYear();
		int month = currentDate.getMonthValue();
		int day = currentDate.getDayOfMonth();
		
		LocalDate returnDate =  currentDate.plusDays(14);
		int year2 = returnDate.getYear();
		int month2 = returnDate.getMonthValue();
		int day2 = returnDate.getDayOfMonth();
		
		public String toString() {
			return " ���� ���ڴ� " + year + "��" + month + "��" + day + "���̰�, �ݳ� ���ڴ� " + year2 + "��" + month2 + "��" + day2 + "�� �Դϴ�.";
		}
		
		/*
		String formatCheckOutDate = checkOutDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		String formatReturnDate = returnDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	*/
}


