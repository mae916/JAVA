package chapter8;

public class OverridingTest {
	public static void main(String[]args) {
		/*
		Customer customerLee = new Customer(10010, "LEE");
		int price = customerLee.calcPrice(10000);
		customerLee.showCustomerInfo();
		System.out.println("지불 금액은 " + price + "입니다. " );
		
		VIPCustomer customerKim = new VIPCustomer(10011, "KIM", 100);
		price = customerKim.calcPrice(10000);
		customerKim.showCustomerInfo();
		System.out.println("지불 금액은 " + price + "입니다. " );
		*/
	
		Customer customerWho = new VIPCustomer(10010, "Who", 100); 
		int price = customerWho.calcPrice(10000);
		customerWho.showCustomerInfo();
		System.out.println("지불 금액은 " + price + "입니다. " );
		//VIPCustomer를 Customer로 다운캐스팅 했는데 calcPrice는 재정의된 VIPCustomer의 calcPrice가 불러와짐.
		// 선언한 클래스형이 아닌 생성된 인스턴스의 메서드를 호출함 -> 가상 메서드
	}
}
