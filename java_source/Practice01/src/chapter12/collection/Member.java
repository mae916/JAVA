package chapter12.collection;

public class Member implements Comparable <Member>{ //<Member���� �ؿ� 
	//Comparable��� �������̽��� �ִ� compareTo��� �߻�޼��带 �����ؼ� ����

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
	
	public String toString() { // ȣ���ϸ� �ٷ� ��� �� �� �ֵ���
		return memberName + "  ȸ������ ���̵�� " + memberId + " �Դϴ�.";
	}

	
	/*
	 ***set
	 set�� �ߺ������ ���ϴϱ� equals()�� hashCode()�� �������ؼ� ó�� �� �����. 
	 �� �� ���� ������ ����� �ϴ� ����,
	 å426p �ڵ�
	 �ν��Ͻ� �ּҰ� �ٸ��� memberId�� ���� ���(���������δ� �ٸ����� �������� �������)�ε�,
	 memberId�� ������ �߰����� �������ϴµ�
	 equals()�� �⺻���� �ν��Ͻ� �ּҸ� ���ϰ� hashCode()�� �ν��Ͻ� �ּҸ� ���ϱ� ������
	 memberId�� ���Ƶ� �ν��Ͻ� �ּҰ� �޶� �߰��� ��.
	 String�̳� Integer�� �̹� ���� ���ڿ��� ��� true�� ��ȯ�ϵ��� ������ �Ǿ� �־ ���ص� ������, 
	 ����ڰ� ����� ���� �̷��� ������ �������.
	
	 ���ͳݼ�ġ
	 �ܼ��� memberŬ������ �Ѱ��ָ� hashset �ߺ����θ� �Ǻ����� ���ؼ�
	 equals() : ���� �� ��ü�� �Ѿ�� ��ü�� ���ٴ°� �˷��ַ��� true�� ��ȯ�������.
	 å365p
	 hashCode() : �Ϲ������� hashCode()�� ������ �Ҷ��� equals() �޼��忡�� �������� ���ٴ� ���� ���� �Ҷ� ����� 
	 					��� ������ Ȱ���ϴ°��� ����.
	�ΰ��� ������ ���ָ� hashset�� �ߺ����θ� �� �� ����.
	 */
	@Override
	public int hashCode() { // �Ʒ� equals���� ���� �� ���پ�.
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // �Ѿ�� obj�� Member���� Ȯ��
			Member member = (Member)obj; //member�� �ٿ�ĳ����
				
			if(this.memberId == member.memberId) { // MemberŬ������ memberId�� �Ѿ�� member�� memberId�� ������ Ȯ��
				return true;
			} 
		}	else return false;
		
		return false; // �Ѿ�� obj�� Member�� �ƴ�.
	}

	//������ ���� 
		//���̵��, �̸��� 
	@Override
	public int compareTo(Member member) { // Ŭ������ <Member>��� �����༭ �Ѿ�°� �ȱ׷� Object�� �Ѿ��
		
		//return (this.memberId - member.memberId); 
		// this.memberId���� �Ѿ�� memberId�� ������ this�� �� ū���(����� ��ȯ�Ǹ�) ������������ Ʈ��������. 
		
		//return (this.memberId - member.memberId) *(-1); //�ΰ��� �������� ��������(����*(-1))
		
		//�̸����� ����
		return (this.memberName.compareTo(member.memberName)); 
		// String�� compareTo�� �̹� ������ �Ǿ��ֱ� ������ �̷��� ���� �⺻������ ������������ ����.
		
		//return (this.memberName.compareTo(member.memberName) *(-1)); // ���� �������� ��������
	}
	
}
