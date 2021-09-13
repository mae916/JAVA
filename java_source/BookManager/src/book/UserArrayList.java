package book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class UserArrayList {
	private ArrayList <User> userList;
	
	public UserArrayList() {
		userList = new ArrayList<User>();
	}
	
	// �̿��� �߰�
	public void addUser(User user) {
		userList.add(user);
	}
	
	// �̿��� ����
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
		System.out.println(userId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	//���� ��¥
	
	public void showAllUser() {
		System.out.println(" �̿��ڹ�ȣ   |    �̸�   |    �޴��� ��ȣ   |    �̿����� ����   |    ��������   |    �ݳ����� ");
		for(User user : userList) {
			System.out.println(user);
			
			LocalDate currentDate = LocalDate.now(); // ���⿡ �ִ°�?
			int year = currentDate.getYear();
			int month = currentDate.getMonthValue();
			int day = currentDate.getDayOfMonth();
			
			LocalDate calcDate =  currentDate.plusDays(14);
			int year2 = calcDate.getYear();
			int month2 = calcDate.getMonthValue();
			int day2 = calcDate.getDayOfMonth();
			
			System.out.println(user.getUserName() + "���� �������ڴ� " + year+ "��" + month + "��" + day + "���̰�, �ݳ����ڴ� " + year2 + "��" + month2 + "��" + day2 + "�� �Դϴ�.");
			System.out.println();
		}
	}
}
