package week3;

public class Book {

	private String author;
	private int isbn;
	private String title;
	private int numberOfPages;
	

	public Book() {
		
	}


	public Book(String author, int isbn,String title, int numberOfPages) {
		this.author=author;
		this.isbn=isbn;
		this.title=title;
		this.numberOfPages=numberOfPages;
			
	}


	@Override
	public String toString() {
		return "Book [author=" + author + ", isbn=" + isbn + ", title=" + title + ", numberOfPages=" + numberOfPages
				+ "]";
	}
	
	public String getauthor() {
		return author;
	}
	
	public void setauthor(String author) {
		this.author=author;
	}

	public int getisbn(){
		return isbn;
	}
	public void setisbn(int isbn) {
		this.isbn=isbn;
	}
	
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this. title=title;
	}
	public int getnumOfPages() {
		return numberOfPages;
	}
	public void getnumOfPages(int numOfPages) {
		this.numberOfPages=numOfPages;
	}
}
