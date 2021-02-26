package week4abstractandinterface;


public abstract class Person {
	
	String name;
	double amount;
	double telebill;
	double taxes;
	
	public Person (String name) {
		this.name=name;
	}
	
	public abstract double taxes (double amount); 
	
	public void calculateTelePhoneBill(double amount) {
		this.amount=amount;
		telebill=this.taxes(amount)+amount;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", amount=" + amount + ", telebill=" + telebill + ", taxes=" + taxes + "]";
	}
	
	
}
