package week4abstractandinterface;

public class Employee extends Person implements Bills{

	@Override
	public double taxes(double amount) {
		// TODO Auto-generated method stub
		return amount*0.2;
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

}
