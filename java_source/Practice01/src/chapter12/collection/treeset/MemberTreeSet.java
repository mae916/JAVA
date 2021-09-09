package chapter12.collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import  chapter12.collection.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeset;
	
	public MemberTreeSet() {
		treeset = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeset.add(member);
	}
	
	public boolean removeMember(int memberId) { // ������ ���⶧���� get(i) ���X
		Iterator<Member> iterator = treeset.iterator(); 
		while(iterator.hasNext()) {
			Member member = iterator.next(); // ��ȯ�ϸ鼭 ���� ��Ұ� �ִ��� Ȯ��(true) ������ false
			int temId = member.getMemberId();
			if(memberId == temId) {
				treeset.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		for(Member member : treeset) {
			System.out.println(member);
		}
	}
}
