package day7.setinterface;

import day7.Member;
import day7.listinterface.MemberArrayList;

public class MemberHashSetTest2 {

		public static void main(String[]args) {
			MemberTreeSet memberhashset = new MemberTreeSet();
			
			Member memberLee = new Member(1001, "������");
			Member memberSon = new Member(1002, "�չα�");
			Member memberPark = new Member(1003, "�ڼ���");
			Member memberHong = new Member(1004, "ȫ�浿");
			
			memberhashset.addMember(memberLee);
			memberhashset.addMember(memberSon);
			memberhashset.addMember(memberPark);
			memberhashset.addMember(memberHong);
			
			memberhashset.showAll();
			
			//�ߺ����̵�
			Member memberLee2 = new Member(1004, "�̼���");
			memberhashset.addMember(memberLee2);
			
			memberhashset.showAll();
			
			
		}
}
