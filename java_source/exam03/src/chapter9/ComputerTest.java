package chapter9;

public class ComputerTest {
	public static void main(String[]args) {
		NoteBook n = new NoteBook(); // Computer 인스턴스 - NoteBook 인스턴스 -> Computer에 접근 할 수 있다는건 이미 생성 되었다는것, NoteBook생성하면서 같이 생성됨. 
									// NoteBook 자료형, Computer 자료형
		DeskTop d = new DeskTop();	//  Computer 인스턴스 - DeskTop 인스턴스
									// DeskTop 자료형, Computer 자료형
		
		Computer[]computers = new Computer[2];
		computers[0] = n;
		computers[1] = d;
		
	}
}
