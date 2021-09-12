package day7.setinterface;

import java.util.HashSet;
import java.util.Iterator;

import day7.Member;

public class MemberHashSet2 {
private HashSet<Member> hashset;
	
	public MemberHashSet2() {
		hashset = new HashSet<Member>();
	}
	
	//멤버추가
	public void addMember(Member member) {
		hashset.add(member);
	}
	
	//멤버 삭제
	public boolean removeMember(int memberId) {
		Iterator<Member> iterator = hashset.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				hashset.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAll() {
		for(Member member : hashset) {
			System.out.println(member);
		}
		System.out.println();
	}
}
