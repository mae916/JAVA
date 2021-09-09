package chapter12.collection.arraylist.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {
	public static void main(String[]args) {
		MemberHashSet memberhashset = new MemberHashSet();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberhashset.addMember(memberLee); 
		memberhashset.addMember(memberKim);
		memberhashset.addMember(memberShin);
		
		memberhashset.showAll();
		
		System.out.println();
		
		Member memberLee2 = new Member(101, "�̸���");
		memberhashset.addMember(memberLee2); 
		memberhashset.showAll();
		
		System.out.println();
		
		memberhashset.removeMember(memberKim.getMemberId());
		memberhashset.showAll();
		
	}
}
