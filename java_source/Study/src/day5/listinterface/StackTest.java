package day5.listinterface;

import java.util.ArrayList;

class MyStack { // 매서드 구현할 클래스
	
	private ArrayList<String> arrayStack = new ArrayList<>();
	
	public void push(String data) { // 집어 넣을 데이터를 하나 받고
		arrayStack.add(data); // 추가하는건 순차적으로 들어가지만,
	}
	
	public String pop() { // 꺼내는것. stack이 
		//데이터가 없는데 꺼내려고 하면 오류가 남.
		int len = arrayStack.size(); //전체 사이즈를 보고,
		if(len == 0) { // 만약 사이즈가 0이면
			System.out.println("스택이 비었습니다.");
			return null;
		}
		//비어있지 않다면
		return arrayStack.remove(len - 1); // 인덱스 번호 맨끝. 최근에 들어갔던게 삭제됨.(스택) 사이즈는 1,2,3... 인덱스는 0,1,2...
	}
}

public class StackTest {
	public static void main(String[]args) {
		 MyStack stack = new MyStack();
		 
		 stack.push("a");
		 stack.push("b");
		 stack.push("c");
		 
		 System.out.println(stack.pop());
		 System.out.println(stack.pop());
		 System.out.println(stack.pop());
		 
		 System.out.println(stack.pop());
		 
		 
	}
}
