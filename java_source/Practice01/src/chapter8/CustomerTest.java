package chapter8;

public class CustomerTest {
	public static void main(String[]args) {
	Customer customerLee = new Customer();
	customerLee.setCustomerID(1001);
	customerLee.setCustomerName("이순신");
	customerLee.bonusPoint = 1000;
	
	customerLee.showCustomerInfo();
	
	VIPCustomer customerKim = new VIPCustomer(1002, "김유신", 100);
	
	customerKim.showCustomerInfo();
	
	
	
	}
}
