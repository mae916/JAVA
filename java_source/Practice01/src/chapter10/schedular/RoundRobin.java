package chapter10.schedular;

public class RoundRobin implements Schedular {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallTogether() {
		System.out.println("���� ���� �������� ��� �մϴ�.");
		
	}

}
