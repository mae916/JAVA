package chapter8;

public class OverridingTest {
	public static void main(String[]args) {
		/*
		Customer customerLee = new Customer(10010, "LEE");
		int price = customerLee.calcPrice(10000);
		customerLee.showCustomerInfo();
		System.out.println("���� �ݾ��� " + price + "�Դϴ�. " );
		
		VIPCustomer customerKim = new VIPCustomer(10011, "KIM", 100);
		price = customerKim.calcPrice(10000);
		customerKim.showCustomerInfo();
		System.out.println("���� �ݾ��� " + price + "�Դϴ�. " );
		*/
	
		Customer customerWho = new VIPCustomer(10010, "Who", 100); 
		int price = customerWho.calcPrice(10000);
		customerWho.showCustomerInfo();
		System.out.println("���� �ݾ��� " + price + "�Դϴ�. " );
		//VIPCustomer�� Customer�� �ٿ�ĳ���� �ߴµ� calcPrice�� �����ǵ� VIPCustomer�� calcPrice�� �ҷ�����.
		// ������ Ŭ�������� �ƴ� ������ �ν��Ͻ��� �޼��带 ȣ���� -> ���� �޼���
	}
}
