package chapter10.schedular;

public class PriorityAllocation implements Schedular {

	@Override
	public void getNextCall() {
		System.out.println("���� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallTogether() {
		System.out.println("���� ��ų�� ���� ���� ������ ��⿭�� �տ� �켱 ����մϴ�.");
		
	}

}
