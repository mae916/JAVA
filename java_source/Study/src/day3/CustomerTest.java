package day3;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[]args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLEE = new Customer(1, "�̼���", 20000); 
		Customer customerHong = new Customer(2, "ȫ�浿", 20000); 
		GoldCustomer customerKim = new GoldCustomer(3, "������", 20000); 
		GoldCustomer customerYoul = new GoldCustomer(4, "������", 20000); 
		VIPCustomer customerShin = new VIPCustomer(5, "�Ż��Ӵ�", 100, 20000); 
		
		customerList.add(customerLEE);
		customerList.add(customerHong);
		customerList.add(customerKim);
		customerList.add(customerYoul);
		customerList.add(customerShin);
		
		System.out.println("--------------------------�� ����-------------------------");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println();
		
		System.out.println("--------------------------�� ����, �ܿ� ����Ʈ-------------------------");
		int price =  10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			int balance = customer.getMoney() - cost;
			System.out.println(customer.getCustomerName() + "���� �����ݾ��� " + cost + "�̰�, ���� �ݾ��� " + balance +" �Դϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�� �Դϴ�.");
			System.out.println();
		}	
	}
}
