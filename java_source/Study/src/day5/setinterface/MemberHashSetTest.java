package day5.setinterface;

import  day5.Member;

public class MemberHashSetTest {
	public static void main(String[]args) {
		MemberHashSet memberhashset = new MemberHashSet();
		
		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberhashset.addMember(memberLee); 
		memberhashset.addMember(memberKim);
		memberhashset.addMember(memberShin);
		
		memberhashset.showAll();
		
		System.out.println();
		
		//아이디 중복회원추가
		Member memberLee2 = new Member(101, "이몽룡");
		memberhashset.addMember(memberLee2); 
		
		memberhashset.showAll();
		
		System.out.println();
		
		//삭제
		memberhashset.removeMember(memberKim.getMemberId());
		memberhashset.showAll();
		
	}
}
