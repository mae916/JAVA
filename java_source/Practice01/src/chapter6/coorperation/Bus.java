package chapter6.coorperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) { //���� ��ȣ�� �Ű������� �����ִ� ������
		this.busNumber = busNumber;
	}
	
	public void take(int money) {//�°��� ������ Ÿ�� �°����� �þ�� ���� ���´�.
		passengerCount++; 
		this.money += money;
	}

	public void showInfo() {
		System.out.println("����" + busNumber + "���� �°��� " + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}
}
