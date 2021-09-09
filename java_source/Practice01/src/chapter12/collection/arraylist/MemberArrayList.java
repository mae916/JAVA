package chapter12.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter12.collection.Member; // �ٸ� ��Ű��

public class MemberArrayList {
	private ArrayList<Member> arrayList; // ����, �����ϴ°� ���� ������ �ȿ��� ��.
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //����
	}
	  
	// ��� �߰�
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// ��� ����(Boolean ���� �޾Ƽ� ������ �� �ƴ��� �ƴ���)
	public Boolean removeMember(int memberId) { // memberId �Ű������� ������ (�����ϰ����ϴ�) memberId�� �迭 �ȿ� �ִ� MemberId�� ������ ���鼭 ��Ī�غ�����

		/*
		for(int i = 0; i < arrayList.size(); i++) { // �迭�ȿ� 3���� ��s���ִٸ� i�� 0,1,2 size�� 1,2,3 �׷��� i�� �� ����
			 Member member = arrayList.get(i); // i��°�� �����ͼ� member�� �ְ� //arrayList���� get(i) �ϸ� object �׻� object�� ������. Member �ڷ������� �ٿ�ĳ����
			int temId = member.getMemberId(); // member���� MemberId�� ������ temId�� �ִ´�.
			if(memberId == tempId) { // �Ű�����(�����ϰ��� �ϴ� memberId�� ������ temId�� ���ٸ�
				arrayList.remove(i); // ������� i��°�� �����Ѵ�.
				return true; // �Ϸ�Ǹ� true ��ȯ
			}
		}
	*/
		
		//Iterator ��� ���� for ���� ����
		Iterator <Member> iterator = arrayList.iterator(); //iterator()�� ���鼭 ��ȯ�Ǵ� ��ü�� <Member> ���߿� �����ö� ����ȯ�� �ʿ�X, arrayList�� ��밡���� iterator()
		while( iterator.hasNext() ) { // boolean hasNext() : ������ ��Ұ� �� �ִ��� üũ�ϰ�, ��Ұ� �ִٸ� true�� ��ȯ(Ȯ��)
			Member member = iterator.next(); // next()���� ��Ҹ� ������ �ͼ� member�� �־��ְ�
			
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arrayList.remove(member);
				return true;
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
