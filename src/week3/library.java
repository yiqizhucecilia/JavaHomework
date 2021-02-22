package week3;

import java.util.ArrayList;


public class library {
	
	Book book;
	Address address;
	ArrayList<String> books=new ArrayList<>();
	String bookname;
	int count;

	public library() {
		
	}
	
	public library(Book book, Address address) {
		
		this.book=book;
		String bookname=book.gettitle();
		books.add(bookname);
		this.address=address;
		count=books.size();
	}
	

	@Override
	public String toString() {
		return "library [book=" + book + ", address=" + address + ", books=" + books + ", bookname=" + bookname
				+ ", count=" + count + "]";
	}
	 
}

	

