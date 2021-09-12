package day5.listinterface;

import day5.Member;

public class MemberArrayListTest {
	public static void main(String[]args) {
		//MemberArrayList 클래스에 add랑 remove를 할거니까 인스턴스 생성
		MemberArrayList memberArrayList = new MemberArrayList(); 
		
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
