package library;

import week3.Address;

public class TestLibrary {

	public static void main(String[] args) {
		
		Address customerAddress1= new Address("1st street", "St.Louis","MO", 63114);
		Address libraryAddress= new Address("2nd street", "St.Louis","MO", 63114);
		
		Book book1=new Book("JK Rowling",123456,"Harry Potter",100);
		
		library libaray1=new library(book1,libraryAddress);
		
		Customer customer1=new Customer("Amy","Brown",customerAddress1);
		
		System.out.println(customer1);
		System.out.println(libaray1);
		
	}

}
