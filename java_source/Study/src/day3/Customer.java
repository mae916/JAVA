package day3;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected int money;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerID, String customerName, int money) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.money = money;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint  +=  bonusRatio*price;
		return price;
	}
	
	//protected라서 상속 받지 않은 (CustomerTest) 클래스에 보내주기 위해 setter(), getter() 써야함 
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
					"이고, 보너스 포인트는 "+ bonusPoint + "입니다.";
	}
}
