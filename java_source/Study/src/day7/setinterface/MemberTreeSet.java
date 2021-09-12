package day7.setinterface;


import java.util.Iterator;
import java.util.TreeSet;

import day7.Member;

public class MemberTreeSet {
private TreeSet <Member> treeset;
	
	public MemberTreeSet() {
		treeset = new TreeSet<Member>();
	}
	
	//멤버추가
	public void addMember(Member member) {
		treeset.add(member);
	}
	
	//멤버 삭제
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
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAll() {
		for(Member member : treeset) {
			System.out.println(member);
		}
		System.out.println();
	}
}
