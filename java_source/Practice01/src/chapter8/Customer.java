package chapter8;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) { //적립 받은 비용을 기존 bonusPoint와 더해서 bonusPoint로 누적
		bonusPoint += price *bonusRatio;
		return price;
	}
	
	public  void showCustomerInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + " 입니다.");
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
