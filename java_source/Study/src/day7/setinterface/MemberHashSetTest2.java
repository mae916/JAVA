package day7.setinterface;

import day7.Member;
import day7.listinterface.MemberArrayList;

public class MemberHashSetTest2 {

		public static void main(String[]args) {
			MemberTreeSet memberhashset = new MemberTreeSet();
			
			Member memberLee = new Member(1001, "이지원");
			Member memberSon = new Member(1002, "손민국");
			Member memberPark = new Member(1003, "박서훤");
			Member memberHong = new Member(1004, "홍길동");
			
			memberhashset.addMember(memberLee);
			memberhashset.addMember(memberSon);
			memberhashset.addMember(memberPark);
			memberhashset.addMember(memberHong);
			
			memberhashset.showAll();
			
			//중복아이디
			Member memberLee2 = new Member(1004, "이순신");
			memberhashset.addMember(memberLee2);
			
			memberhashset.showAll();
			
			
		}
}
