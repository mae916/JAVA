package chapter8;

public class Ex1Test {
	public static void main(String[]args) {
		B b = new B();
		b.methodA();
		b.methodB();
		
		C c = new C(); // A, B, C 생성자 모두 호출함.
		
		B bb = new C(); // A클래스의 인스턴스 + B 클래스의 인스턴스 + C 클래스의 인스턴스 원래 다 갖고 있기 때문에 다운캐스팅으로 원래 자료형으로 돌아 갈 수 있음.
		//bb.하면 A,B만 보임
		A aa = new C(); // A클래스의 인스턴스 + B 클래스의 인스턴스 + C 클래스의 인스턴스 원래 다 갖고 있기 때문에 다운캐스팅으로 원래 자료형으로 돌아 갈 수 있음.
		//aa.하면 A만 보임
		
		C cc = (C)aa; // C는 다 갖고 있기 때문에 다운캐스팅 가능
		
		//A aa = (A)cc;// A는 다 갖고 있지 않기 때문에 형변환 X
		
	}
}
