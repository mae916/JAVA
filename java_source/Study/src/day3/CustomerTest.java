package day3;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[]args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLEE = new Customer(1, "이순신", 20000); 
		Customer customerHong = new Customer(2, "홍길동", 20000); 
		GoldCustomer customerKim = new GoldCustomer(3, "김유신", 20000); 
		GoldCustomer customerYoul = new GoldCustomer(4, "이율곡", 20000); 
		VIPCustomer customerShin = new VIPCustomer(5, "신사임당", 100, 20000); 
		
		customerList.add(customerLEE);
		customerList.add(customerHong);
		customerList.add(customerKim);
		customerList.add(customerYoul);
		customerList.add(customerShin);
		
		System.out.println("--------------------------고객 정보-------------------------");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println();
		
		System.out.println("--------------------------고객 결제, 잔여 포인트-------------------------");
		int price =  10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			int balance = customer.getMoney() - cost;
			System.out.println(customer.getCustomerName() + "님의 결제금액은 " + cost + "이고, 남은 금액은 " + balance +" 입니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
			System.out.println();
		}	
	}
}
