package chapter12.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter12.collection.Member; // 다른 패키지

public class MemberArrayList {
	private ArrayList<Member> arrayList; // 선언만, 생성하는건 보통 생성자 안에서 함.
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //생성
	}
	  
	// 멤버 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 멤버 삭제(Boolean 값을 받아서 삭제가 잘 됐는지 아닌지)
	public Boolean removeMember(int memberId) { // memberId 매개변수에 들어오는 (삭제하고자하는) memberId와 배열 안에 있는 MemberId가 같은지 돌면서 매칭해봐야함

		/*
		for(int i = 0; i < arrayList.size(); i++) { // 배열안에 3개가 들s어있다면 i는 0,1,2 size는 1,2,3 그래서 i가 더 작음
			 Member member = arrayList.get(i); // i번째를 꺼내와서 member에 넣고 //arrayList에서 get(i) 하면 object 항상 object로 꺼내짐. Member 자료형으로 다운캐스팅
			int temId = member.getMemberId(); // member에서 MemberId를 꺼내서 temId에 넣는다.
			if(memberId == tempId) { // 매개변수(삭제하고자 하는 memberId와 꺼내온 temId이 같다면
				arrayList.remove(i); // 가지고온 i번째를 삭제한다.
				return true; // 완료되면 true 반환
			}
		}
	*/
		
		//Iterator 사용 위의 for 문과 같음
		Iterator <Member> iterator = arrayList.iterator(); //iterator()가 돌면서 반환되는 객체가 <Member> 나중에 꺼내올때 형변환할 필요X, arrayList가 사용가능한 iterator()
		while( iterator.hasNext() ) { // boolean hasNext() : 다음에 요소가 더 있는지 체크하고, 요소가 있다면 true를 반환(확인)
			Member member = iterator.next(); // next()다음 요소를 가지고 와서 member에 넣어주고
			
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		//for를 다 돌고 여기까지 왔다는건 중간에 return true; 가 안됐다는것, 같은게 없다는것
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
			}
	
	public void showAll() {
		for(Member member : arrayList) { // member에 arrayList 각 요소가 돌면서 대입 되며 전체를 다 보여줌.
			System.out.println(member); //Member 클래스에서 toString() 재정의함.
		}
		//System.out.println(arrayList); //vector에 toString도 재정의 되어있음.
	}
}
