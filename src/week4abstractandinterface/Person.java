package week4abstractandinterface;

public abstract class Person {
	
	double amount;
	
	public abstract double taxes (double amount); 
	
	public double calculateTelePhoneBill(double amount) {
	return this.taxes(amount)+amount;
	}

	@Override
	public String toString() {
		return "Person [amount=" + amount + "]";
	}
	
	
}
