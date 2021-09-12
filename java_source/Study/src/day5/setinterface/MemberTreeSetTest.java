package day5.setinterface;

import  day5.Member;

public class MemberTreeSetTest {
	public static void main(String[]args) {
		MemberTreeSet memberhashset = new MemberTreeSet();
		
		Member memberLee = new Member(102, "이순신");
		Member memberKim = new Member(101, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberhashset.addMember(memberLee); 
		memberhashset.addMember(memberKim);
		memberhashset.addMember(memberShin);
		
		memberhashset.showAll();

		
	}
}
