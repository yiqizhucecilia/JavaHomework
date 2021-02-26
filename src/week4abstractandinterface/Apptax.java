package week4abstractandinterface;

import java.util.ArrayList;
import java.util.List;

public class Apptax {
	public static void main(String[]args) {
		Student s1=new Student();
		Employee employee1= new Employee();
		
		double telePhonebill=s1.calculateTelePhoneBill(120.5);
		
		System.out.println(telePhonebill);
		
		double telePhonebill2=employee1.calculateTelePhoneBill(100);
		
		System.out.println(telePhonebill2);
		
		Person p1= new Student();
		Employee p2= new Employee();
		
		p1.calculateTelePhoneBill(telePhonebill);
		p2.calculateTelePhoneBill(telePhonebill2);
			
		ArrayList<Student> student=new ArrayList<Student> 
		
	}
}
