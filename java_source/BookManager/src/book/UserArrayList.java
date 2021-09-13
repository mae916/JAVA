package book;

import java.time.LocalDate;
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
	
	//대출 날짜
	
	public void showAllUser() {
		System.out.println(" 이용자번호   |    이름   |    휴대폰 번호   |    이용중인 도서   |    대출일자   |    반납기한 ");
		for(User user : userList) {
			System.out.println(user);
			
			LocalDate currentDate = LocalDate.now(); // 여기에 넣는게?
			int year = currentDate.getYear();
			int month = currentDate.getMonthValue();
			int day = currentDate.getDayOfMonth();
			
			LocalDate calcDate =  currentDate.plusDays(14);
			int year2 = calcDate.getYear();
			int month2 = calcDate.getMonthValue();
			int day2 = calcDate.getDayOfMonth();
			
			System.out.println(user.getUserName() + "님의 대출일자는 " + year+ "년" + month + "월" + day + "일이고, 반납일자는 " + year2 + "년" + month2 + "월" + day2 + "일 입니다.");
			System.out.println();
		}
	}
}
