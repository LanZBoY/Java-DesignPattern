package StrategyPattern;

public class Shop {
	public int amout;
	
	public Shop(int amout) {
		this.amout = amout;
	}
	
	public void purchase(PaymentStrategy paymentStrategy) {
		paymentStrategy.pay(amout);
	}
}
