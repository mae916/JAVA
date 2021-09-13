package book;

import java.time.LocalDate;
import java.util.ArrayList;

public class User {
	
	private int userId;
	private String userName;
	private String userPhoneNumber;
	  //boolean true ó����(����) Book�� checkOut�� ����(true ����?)
	
	public User(int userId, String userName, String userPhoneNumber) {
		this.userId = userId;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		
	}
	
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
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	
	public String toString() {
		return userId + "   |    " + userName + "   |    " + userPhoneNumber + "   |    ";
	}

}
