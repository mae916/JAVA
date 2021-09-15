package chapter9_3;

public abstract class Car {
	abstract void drive(); // 일반 승용차(ManualCar -> 운전자 운전, 자율주행차 -> AI가 운전)
	abstract void stop();
	abstract void startCar(); // 시동 걸기
	abstract void turnOff(); // 시동 끄기
}
