package chapter9;

public class ComputerTest {
	public static void main(String[]args) {
		//Computer c1 = new Computer();
		Computer c2 = new DeskTop(); // ��ĳ����
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.display(); //�ν��Ͻ��� ���� �޼ҵ尡 ȣ��
		c4.display();
		
	}
}
