package chapter12_3.arraylist;

import chapter12_3.Member;

public class QueueTest {
	public static void main(String[]args) {
		Queue<Member> queue = new Queue<>(); //컴파일러가 <Member>는 <>라고 유추 가능하기 때문에 안에 Member는 생략 가능
		queue.enQueue(new Member (1001, "이름1"));
		queue.enQueue(new Member (1002, "이름2"));
		queue.enQueue(new Member (1003, "이름3"));
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}
