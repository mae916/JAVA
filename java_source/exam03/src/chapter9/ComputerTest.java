package chapter9;

public class ComputerTest {
	public static void main(String[]args) {
		NoteBook n = new NoteBook(); // Computer �ν��Ͻ� - NoteBook �ν��Ͻ� -> Computer�� ���� �� �� �ִٴ°� �̹� ���� �Ǿ��ٴ°�, NoteBook�����ϸ鼭 ���� ������. 
									// NoteBook �ڷ���, Computer �ڷ���
		DeskTop d = new DeskTop();	//  Computer �ν��Ͻ� - DeskTop �ν��Ͻ�
									// DeskTop �ڷ���, Computer �ڷ���
		
		Computer[]computers = new Computer[2];
		computers[0] = n;
		computers[1] = d;
		
	}
}
