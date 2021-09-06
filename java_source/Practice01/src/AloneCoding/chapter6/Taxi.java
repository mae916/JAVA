package AloneCoding.chapter6;

public class Taxi {
	int carNumber;
	int passengerNumber;
	int income;
	
	public Taxi(int carNumber) {
		this.carNumber = carNumber;
	}
		
	public void take(int income) {
		passengerNumber++;
		this.income += income;
	}
	
	public void showInfo() {
		System.out.println("택시" + carNumber + "번의 승객은 " + passengerNumber + "명이고, 수입은 " + income + "입니다.");
	
	}
}
