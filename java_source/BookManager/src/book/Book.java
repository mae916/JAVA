package book;

public class Book {
	
	private String bookNumSign;
	private int bookNumber;
	private String bookName;
	private String author;
	private String publisher;
	private boolean checkOut;
	private String callNumber;
	
	public String getBookNumSign() {
		return bookNumSign;
	}

	public void setBookNumSign(String bookNumSign) {
		this.bookNumSign = bookNumSign;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public boolean isCheckOut() {
		return checkOut;
	}

	public void setCheckOut(boolean checkOut) {
		this.checkOut = checkOut;
	}

	public String getCallNumber() {
		return callNumber;
	}

	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}

	public Book( String bookNumSign, int BookNumber, String BookName, String author, String Publisher, boolean checkOut, String callNumber) {
		this.bookNumSign = bookNumSign;
		this.bookNumber = BookNumber;
		this.bookName = BookName;
		this.author = author;
		this.publisher = Publisher;
		this.checkOut = checkOut;
		this.callNumber = callNumber;
	}
	
	public String toString() {
		return bookNumSign +bookNumber + "    |    " + bookName + "    |    " + author + "    |    " + publisher + "    |    " + checkOut + "    |    " +  callNumber;
	}
	
	
	
	/*
	 * HashSet
	 * 
	@Override
	public int hashCode() {
		return bookNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book)obj;
			
			if(this.bookNumber == book.bookNumber) {
				return true;
		}
	} else return false;
		return false;
}

	//등록번호로 정렬
	@Override
	public int compareTo(Book book) {
		return (this.bookNumber - book.bookNumber);
	}
	*/
}
