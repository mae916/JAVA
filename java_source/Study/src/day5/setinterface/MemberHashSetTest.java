package day5.setinterface;

import  day5.Member;

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
		
		//���̵� �ߺ�ȸ���߰�
		Member memberLee2 = new Member(101, "�̸���");
		memberhashset.addMember(memberLee2); 
		
		memberhashset.showAll();
		
		System.out.println();
		
		//����
		memberhashset.removeMember(memberKim.getMemberId());
		memberhashset.showAll();
		
	}
}
