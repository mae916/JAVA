package chapter6.singletone;

public class Company {
	
	private static Company instance = new Company(); //�����ϰ� ������� ��ü �ϳ�
	
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		return instance;
	}
}
