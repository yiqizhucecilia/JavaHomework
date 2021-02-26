package library;

import java.util.Stack;

import week3.Address;

public class TestLibrary {

	public static void main(String[] args) {
		
		Address customerAddress1= new Address("1st street", "St.Louis","MO", 63114);
		Address libraryAddress= new Address("2nd street", "St.Louis","MO", 63114);
		
		Book book1=new Book("JK Rowling",123456,"Harry Potter",100);
		Book book2=new Book("Game of Thrones",123456,"Harry Potter",100);
		
		Library library1 = new Library("St. Louis Public Library", libraryAddress);
		
		
		library1.addBook(book1);
		library1.addBook(book2);
		
		int count = library1.getBooks().size();
		
		System.out.println(library1.getBooks().get(0).gettitle());

		
		Customer customer1=new Customer("Amy","Brown",customerAddress1);
		
		
		System.out.println(customer1);
		//System.out.println(libaray1);
		
	}

}
