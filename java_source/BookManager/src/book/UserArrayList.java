package book;

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
	

	
	//���� ����
	public void  isUseBook(boolean CheckOutB) {
		if(CheckOutB) {
			
			CheckOutB = false;
		}
	}
	
	public void showAllUser() {
		System.out.println(" �̿��ڹ�ȣ     |     �̸�     |     �޴��� ��ȣ     |     ���⿩��     |     ��������     |     �ݳ����� ");
		for(User user : userList) {
			System.out.println(user);
		}
	}
}
