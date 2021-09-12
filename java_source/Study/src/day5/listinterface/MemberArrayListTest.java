package day5.listinterface;

import day5.Member;

public class MemberArrayListTest {
	public static void main(String[]args) {
		//MemberArrayList Ŭ������ add�� remove�� �ҰŴϱ� �ν��Ͻ� ����
		MemberArrayList memberArrayList = new MemberArrayList(); 
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberArrayList.addMember(memberLee); // memberArrayList Ŭ�������� addMember() �޼��� ȣ���ϸ� �Էµ� ���Ǵ�� ����߰���
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberShin);
		
		memberArrayList.showAll();
		
		System.out.println();
		
		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.showAll();
	}
}
