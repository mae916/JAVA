package day5.listinterface;

import java.util.ArrayList;
import java.util.Iterator;

import day5.Member; // �ٸ� ��Ű��

public class MemberArrayList { 
	private ArrayList<Member> arrayList;  //Member��, Member Ŭ������
	// ����, �����ϴ°� ���� ������ �ȿ��� ��.
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //����
	}
	  
	// ��� �߰�
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// ��� ����(Boolean ���� �޾Ƽ� ������ �� �ƴ��� �ƴ���)
	public boolean removeMember(int memberId) { // memberId �Ű������� ������ (�����ϰ����ϴ�) memberId�� �迭 �ȿ� �ִ� MemberId�� ������ ���鼭 ��Ī�غ�����
		for(int i = 0; i < arrayList.size(); i++) { // �迭�ȿ� 3���� ��s���ִٸ� i�� 0,1,2 size�� 1,2,3 �׷��� i�� �� ����
			 Member member = arrayList.get(i); // i��°�� �����ͼ� member�� �ְ� //arrayList���� get(i) �ϸ� object �׻� object�� ������. Member �ڷ������� �ٿ�ĳ����
			int tempId = member.getMemberId(); // member���� MemberId�� ������ temId�� �ִ´�.
			if(memberId == tempId) { // �Ű�����(�����ϰ��� �ϴ� memberId�� ������ temId�� ���ٸ�
				arrayList.remove(i); // ������� i��°�� �����Ѵ�.
				return true; // �Ϸ�Ǹ� true ��ȯ
			}
		}
		//for�� �� ���� ������� �Դٴ°� �߰��� return true; �� �ȵƴٴ°�, ������ ���ٴ°�
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
			}
	
	public void showAll() {
		for(Member member : arrayList) { // member�� arrayList �� ��Ұ� ���鼭 ���� �Ǹ� ��ü�� �� ������.
			System.out.println(member); //Member Ŭ�������� toString() ��������.
		}
		//System.out.println(arrayList); //vector�� toString�� ������ �Ǿ�����.
	}
}
