package day7.setinterface;

import day7.Member;
import day7.listinterface.MemberArrayList;

public class MemberTreeSetTest {

		public static void main(String[]args) {
			MemberTreeSet membertreeset = new MemberTreeSet();
			
			Member memberLee = new Member(1001, "������");
			Member memberSon = new Member(1002, "�չα�");
			Member memberPark = new Member(1003, "�ڼ���");
			Member memberHong = new Member(1004, "ȫ�浿");
			
			membertreeset.addMember(memberLee);
			membertreeset.addMember(memberSon);
			membertreeset.addMember(memberPark);
			membertreeset.addMember(memberHong);
			
			membertreeset.showAll();
			
			
		}
}
