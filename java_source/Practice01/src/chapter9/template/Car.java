package chapter9.template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public void washCar() {}; // �ڵ��� ������ ������ ������ �Ѱ�.

	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
		wiper();
		washCar(); // �ʿ信 ���ؼ� �������Ͽ� ���°�. ������ �׻��ϴ°��� �ƴϰ� �ϰ� ������ �ϴ°�.
	}
}
