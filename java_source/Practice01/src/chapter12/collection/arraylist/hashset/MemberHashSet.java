package chapter12.collection.arraylist.hashset;

import java.util.HashSet;
import java.util.Iterator;

import  chapter12.collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashset;
	
	public MemberHashSet() {
		hashset = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashset.add(member);
	}
	
	public boolean removeMember(int memberId) { // ������ ���⶧���� get(i) ���X
		Iterator<Member> iterator = hashset.iterator(); 
		while(iterator.hasNext()) {
			Member member = iterator.next(); // ��ȯ�ϸ鼭 ���� ��Ұ� �ִ��� Ȯ��(true) ������ false
			int temId = member.getMemberId();
			if(memberId == temId) {
				hashset.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		for(Member member : hashset) {
			System.out.println(member);
		}
	}
}
