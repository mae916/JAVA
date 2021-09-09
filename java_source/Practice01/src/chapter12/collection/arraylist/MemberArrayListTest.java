package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class MemberArrayListTest {
	public static void main(String[]args) {
		MemberArrayList memberArrayList = new MemberArrayList(); //인스턴스 생성후
		
		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberArrayList.addMember(memberLee); // memberArrayList 클래스에서 addMember() 메서드 호출하면 입력된 조건대로 멤버추가됨
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberShin);
		
		memberArrayList.showAll();
		
		System.out.println();
		
		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.showAll();
	}
}
