package day7.setinterface;


import java.util.Iterator;
import java.util.TreeSet;

import day7.Member;

public class MemberTreeSet {
private TreeSet <Member> treeset;
	
	public MemberTreeSet() {
		treeset = new TreeSet<Member>();
	}
	
	//����߰�
	public void addMember(Member member) {
		treeset.add(member);
	}
	
	//��� ����
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = treeset.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				treeset.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAll() {
		for(Member member : treeset) {
			System.out.println(member);
		}
		System.out.println();
	}
}
