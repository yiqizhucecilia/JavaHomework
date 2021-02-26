package week4abstractandinterface;

import java.util.ArrayList;
import java.util.List;

public class Apptax {
	public static void main(String[]args) {
		Student s1=new Student("Sassy");
		Employee e1= new Employee("Mary");
		
		s1.amount=120;
		s1.taxes(s1.amount);
		e1.amount=200;
		e1.taxes(e1.amount);
		
		//System.out.println(telePhonebill);
		
		//double telePhonebill2=employee1.calculateTelePhoneBill(100);
		
		//System.out.println(telePhonebill2);
		
		Person p1= new Student("Amy");
	    Person p2= new Employee("Tony");
	    p1.amount=100;
		p1.calculateTelePhoneBill(p1.amount);
		p2.calculateTelePhoneBill(300);
	
		System.out.println(s1);
		System.out.println(e1);
		System.out.println(p1);
		System.out.println(p2);
		
		List<Person> student= new ArrayList<Person>();
		List<Person> employee=new ArrayList<Person>();
		
		student.add(s1);
		employee.add(e1);
		
		System.out.print(student);
		
		System.out.print(employee);
		
		School school1=new School();
		school1.add1(student);
		school1.add2(employee);
		System.out.println(school1);
	}

}
