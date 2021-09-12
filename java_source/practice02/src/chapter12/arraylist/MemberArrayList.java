package chapter12.arraylist;

import java.util.ArrayList;

import chapter12.collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList; // ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	//����߰�
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//��� ����
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int temId = member.getMemberId(); //memberId�� �������
			if(memberId == temId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
	}
}
