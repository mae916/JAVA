package day5.setinterface;

import java.util.HashSet;
import java.util.Iterator;

import  day5.Member;

public class MemberHashSet {
	private HashSet<Member> hashset; //����
	
	public MemberHashSet() {
		hashset = new HashSet<Member>(); // ����
	}
	
	//����߰�
	public void addMember(Member member) {
		hashset.add(member);
	}
	
	//��� ����
	public boolean removeMember(int memberId) { // ������ ���⶧���� get(i) �����ϰ� Iterator ���
		Iterator<Member> iterator = hashset.iterator(); // for��ó�� ��ȸ�ϸ鼭 ��Ҹ� �ϳ��� ������ ��
		while(iterator.hasNext()) {  // iterator�� ��ȯ�ϸ鼭 hasNext()�� ���� ��Ұ� �ִ��� Ȯ�� ������ true ������ false
			Member member = iterator.next(); // iterator�� ��ȯ�ϸ鼭 next()�� ������ �ִ� ��Ҹ� ��ȯ, member�� ����
			int temId = member.getMemberId(); //������ ��ҿ��� MemberId�� ��������
			if(memberId == temId) { // ���� memberId�� �������� üũ
				hashset.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAll() {
		for(Member member : hashset) {
			System.out.println(member);
		}
	}
}
