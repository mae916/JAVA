package chapter12.collection.arraylist.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {
	public static void main(String[]args) {
		MemberHashSet memberhashset = new MemberHashSet();
		
		Member memberLee = new Member(101, "ÀÌ¼ø½Å");
		Member memberKim = new Member(102, "±èÀ¯½Å");
		Member memberShin = new Member(103, "½Å»çÀÓ´ç");
		
		memberhashset.addMember(memberLee); 
		memberhashset.addMember(memberKim);
		memberhashset.addMember(memberShin);
		
		memberhashset.showAll();
		
		System.out.println();
		
		Member memberLee2 = new Member(101, "ÀÌ¸ù·æ");
		memberhashset.addMember(memberLee2); 
		memberhashset.showAll();
		
		System.out.println();
		
		memberhashset.removeMember(memberKim.getMemberId());
		memberhashset.showAll();
		
	}
}
