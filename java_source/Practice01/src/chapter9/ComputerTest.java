package chapter9;

public class ComputerTest {
	public static void main(String[]args) {
		//Computer c1 = new Computer();
		Computer c2 = new DeskTop(); // 업캐스팅
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.display(); //인스턴스명에 따라 메소드가 호출
		c4.display();
		
	}
}
