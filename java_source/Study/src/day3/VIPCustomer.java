package day3;

public class VIPCustomer extends Customer {
	protected double saleRatio;
	protected int agentID;

public VIPCustomer(int customerID, String customerName, int agentID, int money) {
	super(customerID,customerName, money);
	this.agentID = agentID;
	customerGrade = "VIP";
	saleRatio = 0.1;
	bonusRatio = 0.05;
}

@Override
public int calcPrice(int price) {
	bonusPoint += price * bonusRatio;
	return price - (int)(price * saleRatio);
}

public int getAgentID() {
	return agentID;
}

@Override
public String showCustomerInfo() {
	return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다.";
}



}
