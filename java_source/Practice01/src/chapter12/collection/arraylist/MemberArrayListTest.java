package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class MemberArrayListTest {
	public static void main(String[]args) {
		MemberArrayList memberArrayList = new MemberArrayList(); //�ν��Ͻ� ������
		
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
