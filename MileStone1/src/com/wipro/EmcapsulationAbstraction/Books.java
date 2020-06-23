package com.wipro.EmcapsulationAbstraction;
class Author {
	private String name, email;
	private char gender;
	Author (String n,String e,char g){
		name = n;
	    email = e;
	    gender = g;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	
}
class Book {
	private String name;
	Author author;
	private double price;
	private int qtyInStock;
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	Book (String n){
		name = n;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
}
public class Books {

	public static void main(String[] args) {
		Author a = new Author("Harper Lee","harperlee24@gmail.com",'F');
		Book b = new Book("To Kill A Mockingbird");
		b.setAuthor(a);
		b.setPrice(91.09);
		b.setQtyInStock(200);
		System.out.println("the name of a book: "+b.getName());
		System.out.println("price of a book: "+b.getPrice());
		System.out.println("number of books in stock are: "+b.getQtyInStock());
		System.out.println("author name: "+b.getAuthor().getName());
		System.out.println("mail id: "+b.getAuthor().getEmail());
		System.out.println("gender: "+b.getAuthor().getGender());
		
	}

}
