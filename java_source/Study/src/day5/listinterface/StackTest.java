package day5.listinterface;

import java.util.ArrayList;

class MyStack { // �ż��� ������ Ŭ����
	
	private ArrayList<String> arrayStack = new ArrayList<>();
	
	public void push(String data) { // ���� ���� �����͸� �ϳ� �ް�
		arrayStack.add(data); // �߰��ϴ°� ���������� ������,
	}
	
	public String pop() { // �����°�. stack�� 
		//�����Ͱ� ���µ� �������� �ϸ� ������ ��.
		int len = arrayStack.size(); //��ü ����� ����,
		if(len == 0) { // ���� ����� 0�̸�
			System.out.println("������ ������ϴ�.");
			return null;
		}
		//������� �ʴٸ�
		return arrayStack.remove(len - 1); // �ε��� ��ȣ �ǳ�. �ֱٿ� ������ ������.(����) ������� 1,2,3... �ε����� 0,1,2...
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
