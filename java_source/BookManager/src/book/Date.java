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
			return " 대출 일자는 " + year + "년" + month + "월" + day + "일이고, 반납 일자는 " + year2 + "년" + month2 + "월" + day2 + "일 입니다.";
		}
		
		/*
		String formatCheckOutDate = checkOutDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		String formatReturnDate = returnDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	*/
}


