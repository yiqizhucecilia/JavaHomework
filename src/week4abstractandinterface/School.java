package week4abstractandinterface;


import java.util.ArrayList;
import java.util.List;

public class School {
	
	 List<Person> schools = new ArrayList<>();
	 
	//List<Employee> employee=new ArrayList<Employee>();
	public void add1(List<Person> student) {
			this.schools.addAll(student);
	}
	
	public void add2(List<Person> employee) {
		this.schools.addAll(employee);
	}

	@Override
	public String toString() {
		return "School [schools=" + schools + "]";
	}
	
	
 
}
