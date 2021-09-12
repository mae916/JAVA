package day5.setinterface;

import java.util.HashSet;
import java.util.Iterator;

import  day5.Member;

public class MemberHashSet {
	private HashSet<Member> hashset; //선언
	
	public MemberHashSet() {
		hashset = new HashSet<Member>(); // 생성
	}
	
	//멤버추가
	public void addMember(Member member) {
		hashset.add(member);
	}
	
	//멤버 삭제
	public boolean removeMember(int memberId) { // 순서가 없기때문에 get(i) 사용못하고 Iterator 사용
		Iterator<Member> iterator = hashset.iterator(); // for문처럼 순회하면서 요소를 하나씩 꺼내는 것
		while(iterator.hasNext()) {  // iterator가 순환하면서 hasNext()가 다음 요소가 있는지 확인 있으면 true 없으면 false
			Member member = iterator.next(); // iterator가 순환하면서 next()가 다음에 있는 요소를 반환, member에 대입
			int temId = member.getMemberId(); //가져온 요소에서 MemberId를 가져오고
			if(memberId == temId) { // 들어온 memberId랑 같은건지 체크
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
