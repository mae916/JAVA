package day5.setinterface;

import  day5.Member;

public class MemberTreeSetTest {
	public static void main(String[]args) {
		MemberTreeSet memberhashset = new MemberTreeSet();
		
		Member memberLee = new Member(102, "�̼���");
		Member memberKim = new Member(101, "������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberhashset.addMember(memberLee); 
		memberhashset.addMember(memberKim);
		memberhashset.addMember(memberShin);
		
		memberhashset.showAll();

		
	}
}
