package chapter8;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) { //메서드 오버라이딩(customer와 같은 메서드를 덮어쓴것.재정의) / 오버로딩은 같은 이름의 메서드가 여러개 있는것
		bonusPoint += price *bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
}
