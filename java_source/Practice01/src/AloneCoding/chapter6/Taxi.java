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
		System.out.println("�ý�" + carNumber + "���� �°��� " + passengerNumber + "���̰�, ������ " + income + "�Դϴ�.");
	
	}
}
