package chapter6.coorperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) { //버스 번호를 매개변수로 갖고있는 생성자
		this.busNumber = busNumber;
	}
	
	public void take(int money) {//승객이 버스를 타면 승객수가 늘어나고 돈이 들어온다.
		passengerCount++; 
		this.money += money;
	}

	public void showInfo() {
		System.out.println("버스" + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}
