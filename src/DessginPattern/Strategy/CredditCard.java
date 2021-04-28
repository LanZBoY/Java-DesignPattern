package DessginPattern.Strategy;

public class CredditCard implements PaymentStrategy {
	
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CredditCard(String name, String cardNumber, String cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}
	@Override
	public String toString() {
		String credditInfo = "Name : " + name;
		return credditInfo;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println("You has pay " + amount + " with Creddit");
		System.out.println(this);
	}

}
