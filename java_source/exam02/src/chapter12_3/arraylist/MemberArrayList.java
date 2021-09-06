package chapter12_3.arraylist;

import java.util.ArrayList;
import chapter12_3.Member;
import java.util.Iterator;

/*
 * ArrayList - 추가, 삭제, 출력
 */

public class MemberArrayList {
	private ArrayList<Member> memberList; //Member 인스턴스를 담을 공간(선언만 되어있음)
	
	public MemberArrayList() {
		memberList = new ArrayList<Member>();
	}
	
	//회원추가
	public void addMember(Member member) {
		if(member != null) {
			memberList.add(member);
		}
	}
	
	//특정 위치에서 회원 추가
	public void insertMember(int index, Member member) {
		if(member != null && index >= 0 && index <= memberList.size()) {
			memberList.add(index, member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		//get -> arrayList ->  요소를 조회
		Iterator<Member> ir = memberList.iterator();
		while(ir.hasNext()) {//다음 요소가 있으면 true
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				memberList.remove(member);
				return true;
			}
		}
		/*
		for (int i = 0; i < memberList.size(); i++) { // 아래 코드에서 get에 인덱스 번호가 필요하기 때문에 향상된 for문을 쓰지 못하고 이렇게 써주어야함.
			Member member = memberList.get(i); //ArrayList의 get()는 리스트에서 어떤 객체를 가져오는데 사용되는 메소드
			if(member.getMemberId() == memberId) {
				memberList.remove(i); // 인덱스 번호(i) 로 제거
				return true;
			}
		}
		*/
		
		return false; //반복문이 끝날때까지 해당 아이디를 찾지 못한 경우
	}
	
	// 회원 목록 출력
	public void showMembers() {
		for(Member member : memberList) {
			System.out.println(member);
		}
	}
}
