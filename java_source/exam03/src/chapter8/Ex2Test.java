package chapter8;

public class Ex2Test {

	public static void main(String[] args) {
		B c = new C();
		c.method(); //B클래스 인데 C 클래스 메서드 가 호출되는 이유; 인스턴스의 메소드가 호출 되기 때문. new C() C인스턴스니까.

	}

}
