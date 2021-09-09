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
	
	public boolean removeMember(int memberId) { // 순서가 없기때문에 get(i) 사용X
		Iterator<Member> iterator = hashset.iterator(); 
		while(iterator.hasNext()) {
			Member member = iterator.next(); // 순환하면서 다음 요소가 있는지 확인(true) 없으면 false
			int temId = member.getMemberId();
			if(memberId == temId) {
				hashset.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member : hashset) {
			System.out.println(member);
		}
	}
}
