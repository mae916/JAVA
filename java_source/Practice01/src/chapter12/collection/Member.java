package chapter12.collection;

public class Member implements Comparable <Member>{ //<Member설명 밑에 
	//Comparable라는 인터페이스에 있는 compareTo라는 추상메서드를 구현해서 정렬

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

	
	/*
	 ***set
	 set이 중복허용을 안하니까 equals()랑 hashCode()를 재정의해서 처리 해 줘야함. 
	 이 두 개를 재정의 해줘야 하는 이유,
	 책426p 코드
	 인스턴스 주소가 다르고 memberId는 같은 경우(물리적으로는 다르지만 논리적으론 같은경우)인데,
	 memberId가 같으면 추가되지 말아햐하는데
	 equals()의 기본값이 인스턴스 주소를 비교하고 hashCode()도 인스턴스 주소를 비교하기 때문에
	 memberId가 같아도 인스턴스 주소가 달라서 추가가 됨.
	 String이나 Integer는 이미 같은 문자열의 경우 true를 반환하도록 재정의 되어 있어서 안해도 되지만, 
	 사용자가 만든건 따로 이렇게 재정의 해줘야함.
	
	 인터넷서치
	 단순히 member클래스를 넘겨주면 hashset 중복여부를 판별하지 못해서
	 equals() : 현재 이 객체랑 넘어온 객체가 같다는걸 알려주려면 true를 반환해줘야함.
	 책365p
	 hashCode() : 일반적으로 hashCode()를 재정의 할때는 equals() 메서드에서 논리적으로 같다는 것을 구현 할때 사용한 
	 					멤버 변수를 활용하는것이 좋다.
	두개를 재정의 해주면 hashset이 중복여부를 알 수 있음.
	 */
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
		
		//return (this.memberId - member.memberId); 
		// this.memberId에서 넘어온 memberId를 뺐을때 this가 더 큰경우(양수가 반환되면) 오름차순으로 트리구성됨. 
		
		//return (this.memberId - member.memberId) *(-1); //두개를 뒤집으면 내림차순(음수*(-1))
		
		//이름으로 정렬
		return (this.memberName.compareTo(member.memberName)); 
		// String엔 compareTo가 이미 구현이 되어있기 때문에 이렇게 쓰면 기본적으로 오름차순으로 나옴.
		
		//return (this.memberName.compareTo(member.memberName) *(-1)); // 값을 뒤집으면 내림차순
	}
	
}
