package chapter12_3.hashset;

import chapter12_3.Member;

public class MemberHashSetTest {
	public static void main(String[]args) {
		MemberHashSet list = new MemberHashSet();
		list.addMember(new Member(1001,"이름1"));
		list.addMember(new Member(1002,"이름2")); 
		list.addMember(new Member(1003,"이름3"));// 인스턴스가 다름 중복X
		list.addMember(new Member(1003,"이름3"));// 인스턴스가 다름 중복X ==> equals(), HashSet() 사용
		list.addMember(new Member(1003,"이름4"));
		
		list.showMembers();
	}
}
