public class Book {
	private String name;
	private String publisher;
	private Personne author;
	public Book(String name,String publisher,Personne author) {
		this.name = name;
		this.publisher = publisher;
		this.author = author;
	}
	public void printBook() {
		System.out.println("Book's name : "+this.name+" ,book's publisher : "+this.publisher+" and book's author : "+this.author);
	}
}
