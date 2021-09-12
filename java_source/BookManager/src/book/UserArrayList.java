package book;

import java.util.ArrayList;
import java.util.Iterator;

public class UserArrayList {
	private ArrayList <User> userList;
	
	public UserArrayList() {
		userList = new ArrayList<User>();
	}
	
	// 이용자 추가
	public void addUser(User user) {
		userList.add(user);
	}
	
	// 이용자 삭제
	public boolean removeUser(int userId) {
		Iterator<User> iterator = userList.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			int getId = user.getUserId();
			if(userId == getId) {
				userList.remove(user);
				return true;
			}
		}
		System.out.println(userId + "가 존재하지 않습니다.");
		return false;
	}
	

	
	//대출 상태
	public void  isUseBook(boolean CheckOutB) {
		if(CheckOutB) {
			
			CheckOutB = false;
		}
	}
	
	public void showAllUser() {
		System.out.println(" 이용자번호     |     이름     |     휴대폰 번호     |     대출여부     |     대출일자     |     반납기한 ");
		for(User user : userList) {
			System.out.println(user);
		}
	}
}
