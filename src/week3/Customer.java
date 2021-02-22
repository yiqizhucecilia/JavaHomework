package week3;

public class Customer {
	
	private	String firstName;
	private String lastName;
	
	Address address;

	public Customer() {
		
	}

	public Customer(String firstName, String lastName, Address address) {
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.address=address;
		
	}
	
	
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;

	}
	
	public String getLastName() {
		return lastName;
	
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	
	public Address getAddress() {
		return getAddress();
	} 
	
}
