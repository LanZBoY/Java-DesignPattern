package StrategyPattern;

public class PayPal implements PaymentStrategy {
	private String email;
	
	private String password;
	
	public PayPal(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	@Override
	public String toString() {
		String payPalInfo = "EMAIL : " + email;
		return payPalInfo;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println("You has pay " + amount + " with PayPal");
		System.out.println(this);
	}

}
