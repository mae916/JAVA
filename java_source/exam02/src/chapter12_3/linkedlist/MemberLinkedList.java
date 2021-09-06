package chapter12_3.linkedlist;

import java.util.LinkedList;
import chapter12_3.Member;

/*
 * 추가, 삭제, 조회
 */
public class MemberLinkedList {
	private LinkedList<Member> memberList;
	
	public MemberLinkedList() {
		memberList = new LinkedList<Member>();
	}
	
	// 회원 추가
	public void addMember(Member member) {
		if (member != null) { // 비어있는건 추가 하지 않음.
		memberList.add(member);
		}
	}
	
	//회원의 목록 첫번째에 추가
	public void insertFirst(Member member) {
		memberList.addFirst(member);
	}
	
	// 회원 제거
	public boolean removeMember(int memberId) { //제거 되면 true, 제거가 안되면 false
		for(int i = 0; i < memberList.size(); i++) {
			Member member = memberList.get(i); // ArrayList의 get()는 리스트에서 어떤 객체를 가져오는데 사용되는 메소드
			if(member.getMemberId() == memberId) {
				memberList.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	// 회원출력
	public void showMembers() {
		for(Member member : memberList) {
			System.out.println(member);
		}
	}
}
