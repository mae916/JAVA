package chapter12.collection;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) { // 매개변수가 있는 생성자
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

	@Override
	public String toString() { // 호출하면 바로 출력 될 수 있도록
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
}
