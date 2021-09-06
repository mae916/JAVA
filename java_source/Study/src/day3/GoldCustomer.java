package day3;

public class GoldCustomer extends Customer  {
	protected double saleRatio;

public GoldCustomer(int customerID, String customerName, int money) {
	super(customerID,customerName, money);
	customerGrade = "GOLD";
	saleRatio = 0.1;
	bonusRatio = 0.02;
}

@Override
public int calcPrice(int price) {
	bonusPoint += price*bonusRatio;
	return price - (int)(price*saleRatio);
}


}
