package AloneCoding.chapter5;

public class OrderTest {
	public static void main(String[]args) {
		Order order = new Order();
		order.orderNumber = 201803120001L;
		order.customerID = "abc123";
		order.orderDate = "2018�� 3�� 12��";
		order.customerName = "ȫ���";
		order.orderProductID = "PD0345-12";
		order.shippingAdress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order.orderNumber);
		System.out.println("�ֹ��� ���̵� : " + order.customerID);
		System.out.println("�ֹ� ��¥ : " + order.orderDate);
		System.out.println("�ֹ��� �̸� : " + order.customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.orderProductID);
		System.out.println("��� �ּ� : " + order.shippingAdress);
	}
}
