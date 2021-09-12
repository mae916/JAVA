package chapter12.arraylist;

import java.util.ArrayList;

import chapter12.collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList; // 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	//멤버추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//멤버 삭제
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int temId = member.getMemberId(); //memberId가 들어있음
			if(memberId == temId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
	}
}
