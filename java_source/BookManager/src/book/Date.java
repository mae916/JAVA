package book;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
	
public class Date {
		
		public String currentDateMethod() {
		LocalDate currentDate = LocalDate.now();
		int year = currentDate.getYear();
		int month = currentDate.getMonthValue();
		int day = currentDate.getDayOfMonth();
		return (year+ "��" + month + "��" + day + "��");
		}
		
		public String returnDateMethod(LocalDate currentDate) {
		LocalDate returnDate =  currentDate.plusDays(14);
		int year2 = returnDate.getYear();
		int month2 = returnDate.getMonthValue();
		int day2 = returnDate.getDayOfMonth();
		return (year2+ "��" + month2 + "��" + day2 + "��");
		}
		
		/*
		public String toString() {
			return " ���� ���ڴ� " + year + "��" + month + "��" + day + "���̰�, �ݳ� ���ڴ� " + year2 + "��" + month2 + "��" + day2 + "�� �Դϴ�.";
		}
		*/
		
		/*
		String formatCheckOutDate = checkOutDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		String formatReturnDate = returnDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	*/
}


