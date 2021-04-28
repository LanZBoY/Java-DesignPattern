package StrategyPattern;

public class StrategyPatternTest {

	public static void main(String[] args) {
		Shop shop = new Shop(100);
		PayPal paypal = new PayPal("gmail","wwww");
		CredditCard card = new CredditCard("casw","qweqwe","weqe","wqeqwesd");
		shop.purchase(card);
		shop.purchase(paypal);
	}

}
