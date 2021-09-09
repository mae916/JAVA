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
	
	public boolean removeMember(int memberId) { // 순서가 없기때문에 get(i) 사용X
		Iterator<Member> iterator = treeset.iterator(); 
		while(iterator.hasNext()) {
			Member member = iterator.next(); // 순환하면서 다음 요소가 있는지 확인(true) 없으면 false
			int temId = member.getMemberId();
			if(memberId == temId) {
				treeset.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member : treeset) {
			System.out.println(member);
		}
	}
}
