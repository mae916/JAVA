package day7.setinterface;

import day7.Member;
import day7.listinterface.MemberArrayList;

public class MemberTreeSetTest {

		public static void main(String[]args) {
			MemberTreeSet membertreeset = new MemberTreeSet();
			
			Member memberLee = new Member(1001, "ÀÌÁö¿ø");
			Member memberSon = new Member(1002, "¼Õ¹Î±¹");
			Member memberPark = new Member(1003, "¹Ú¼­ÈÍ");
			Member memberHong = new Member(1004, "È«±æµ¿");
			
			membertreeset.addMember(memberLee);
			membertreeset.addMember(memberSon);
			membertreeset.addMember(memberPark);
			membertreeset.addMember(memberHong);
			
			membertreeset.showAll();
			
			
		}
}
