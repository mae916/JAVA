package book;

import java.time.LocalDate;

public class User  {
	
	private int userId;
	private String userName;
	private String userPhoneNumer;
	private boolean checkOut;	 
	//private Date checkOutDate;
	//private Date returnDate;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNumer() {
		return userPhoneNumer;
	}

	public void setUserPhoneNumer(String userPhoneNumer) {
		this.userPhoneNumer = userPhoneNumer;
	}

	/*
	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
*/

	public User(int userId, String userName, String userPhoneNumer) {
		this.userId = userId;
		this.userName = userName;
		this.userPhoneNumer = userPhoneNumer;
		//this.checkOutDate = new Date();
		//this.returnDate = new Date();
	}
	
	public String toString() {
		return userId + "    |    " + userName + "    |    " + userPhoneNumer;
	}
	
	
	
	
	
	
}
