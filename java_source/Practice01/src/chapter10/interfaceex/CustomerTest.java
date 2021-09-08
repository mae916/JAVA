package chapter10.interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		 // 가상 메서 드
		customer.order();
		buyer.order();
		seller.order();
	}

}
