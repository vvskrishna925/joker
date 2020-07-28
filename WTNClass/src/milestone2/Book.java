package milestone2;
import java.util.*;
public class Book {
private int bookId;
private String bookName;
public Book (String bookName, int bookId) {
	this.bookId = bookId;
	this.bookName = bookName;
}
public static void main(String[] args) {
	Book b1 = new Book("java",101);
	Book b2 = new Book("c",102);
	Book b3 = new Book("python",103);
	ArrayList<Book> bb = new ArrayList<Book>();
	bb.add(b1);
	bb.add(b2);
	bb.add(b3);
	Iterator<Book> i = bb.iterator();
	while (i.hasNext()) {
		Book b = i.next();
		System.out.println(b.bookId + ":" + b.bookName);
	}
}
}
