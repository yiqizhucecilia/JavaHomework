package week4abstractandinterface;

public class Student extends Person implements Bills{

	@Override
	public double taxes(double amount) {
		return amount*0.02;
	}

	
	@Override
	public double gasbill(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double carinsurance(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String toString() {
		return "Student [amount=" + amount + "]";
	}

	
	
	

}
