package chapter6;

public class Bus {
	int num; // �뼱��ȣ
	int passengerCount; // �°��� ��
	int fare; // ���� ���
	int profit; // ������ ������� ���� 
	
	public Bus(int num, int fare) {
		this.num = num;
		this.fare = fare;
	}
	
	public void collect(Student s) {
		this.profit += this.fare; // ������ �°��� �� ���� ���Ϳ� �߰� 
		this.passengerCount++;
		
		s.money -= this.fare; // ������ ź �л��� ������ ���� ��ݸ�ŭ ���� 
	}
	
	public void showInfo() {
		System.out.println("Bus No." + num + " : " + passengerCount + "�� ž�� : " + profit);
	}
}
