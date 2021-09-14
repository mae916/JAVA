package chapter3;

public class Student {
	public static int serialNum; //일련번호
	public int studentID; //학번
	public String name; //이름
	
	public static int getserialNum() {
		//멤버변수, 인스턴스 메서드 -> 사용 할 수 있는가? X 
		//studentID = 100;
		return serialNum;
	}
	
	public void showInfo() {
		//정적변수, 정적 메서드 접근이 가능한가? O
		System.out.println("학번 : " + studentID + "이름 : " + name);
	}
}
