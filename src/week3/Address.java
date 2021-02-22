package week3;

public class Address {

	String street;
	String city;
	String state;
	Integer zipCode;
	
	public Address() {
		
	}
	public Address(String street, String city, String state, Integer zipCode) {
		this.street=street;
		this.city=city;
		this.state=state;
		this.zipCode=zipCode;
		
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	
}
