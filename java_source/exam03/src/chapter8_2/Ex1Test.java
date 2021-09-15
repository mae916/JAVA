package chapter8_2;

public class Ex1Test {
	public static void main(String[]args) {
		
		
		Human human = new Human(); //하위클래스가 상위 클래스로 가는건 문제없음. 다 갖고 있기 때문
		Tiger tiger = new Tiger();
		
		human.move();
		tiger.move();
	}
}
