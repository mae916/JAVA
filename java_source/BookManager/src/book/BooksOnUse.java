package book;

public class BooksOnUse extends Book {

	private String checkOutDate;
	private	String returnDate;
	
	public BooksOnUse(String bookNumSign, int bookNumber, String bookName, String author, String publisher, String callNumber, String checkOutDate, String returnDate) {
		super(bookNumSign, bookNumber, bookName, author, publisher, callNumber);
		this.checkOutDate = checkOutDate;
		this.returnDate = returnDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	


	
	
	
	
	
	
}
