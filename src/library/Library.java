package library;

import java.util.ArrayList;
import java.util.List;

import week3.Address;


public class Library {
	
	
	String name;
	Address address;
	ArrayList<Book> books=new ArrayList<>();

	public Library() {
		
	}
	
	public Library(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}
	
	public List<Book> getBooks(){
		
		if(books.isEmpty()) {
			System.out.println("There are no books in the library");
		}
		
		return books;
	}
	
	public void addBook(Book newBook) {
		this.books.add(newBook);
	}
	
	public int countBooks() {
		return books.size();
	}
	
	public void setName(String name) {
		System.out.println("Changing " + this.name + " to " + name);
		this.name = name;
	}
	

//	@Override
//	public String toString() {
//		return "library [book=" + book + ", address=" + address + ", books=" + books + ", count=" + count + "]";
	}
	 


	

