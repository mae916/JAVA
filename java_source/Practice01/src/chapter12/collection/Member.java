package chapter12.collection;

public class Member implements Comparable <Member>{

	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() { // 호출하면 바로 출력 될 수 있도록
		return memberName + "  회원님의 아이디는 " + memberId + " 입니다.";
	}

	@Override
	public int hashCode() { // 아래 equals에서 쓰인 걸 갖다씀.
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // 넘어온 obj가 Member인지 확인
			Member member = (Member)obj; //member로 다운캐스팅
				
			if(this.memberId == member.memberId) { // Member클래스의 memberId와 넘어온 member의 memberId가 같은지 확인
				return true;
			} 
		}	else return false;
		
		return false; // 넘어온 obj가 Member가 아님.
	}

	//정렬할 기준 
		//아이디순, 이름순 
	@Override
	public int compareTo(Member member) { // 클래스에 <Member>라고 적어줘서 넘어온것 안그럼 Object로 넘어옴
		
		//return (this.memberId - member.memberId); // this.memberId에서 넘어온 memberId를 뺐을때 this가 더 큰경우(양수가 반환되면) 오름차순으로 트리구성됨. 
		//return (this.memberId - member.memberId) *(-1); //두개를 뒤집으면 내림차순(음수*(-1))
		
		return (this.memberName.compareTo(member.memberName)); // compareTo가 이미 구현이 되어있기 때문에 이렇게 쓰면 기본적으로 오름차순으로 나옴.
		//return (this.memberName.compareTo(member.memberName) *(-1)); // 값을 뒤집으면 내림차순
	}
	
}
