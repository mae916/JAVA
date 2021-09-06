package chapter6.singletone;

public class Company {
	
	private static Company instance = new Company(); //유일하게 만들어진 객체 하나
	
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null)
			instance = new Company();
		return instance;
	}
}
