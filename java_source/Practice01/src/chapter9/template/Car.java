package chapter9.template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public void washCar() {}; // 코드의 내용이 없을뿐 구현은 한것.

	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
		wiper();
		washCar(); // 필요에 의해서 재정의하여 쓰는것. 세차를 항상하는것은 아니고 하고 싶을때 하는것.
	}
}
