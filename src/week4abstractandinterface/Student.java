package week4abstractandinterface;

public class Student extends Person implements Bills{
	
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	double taxes;
	
	@Override
	public double taxes(double amount) {
		 taxes=amount*0.02;
		 return taxes;
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
		return "Student [taxes=" + taxes + ", name=" + name + ", amount=" + amount + ", telebill=" + telebill + "]";
	}



}
