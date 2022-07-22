import java.util.Scanner;

public class CH08_History extends CH08_Book{
	private String history_name;
	private String book_author;
	private int n;
	Scanner s = new Scanner (System.in);
	
	public CH08_History(String s1, String s2) {
		n = ++id;
		history_name = s1;
		book_author = s2;
	}
	public void print() {
		System.out.println("<<<History>>>");
		System.out.println("Id: "+ n);
		System.out.println("Book Name: "+history_name);
		System.out.println("Author: "+book_author);
	}
	public String toString() {
		return("<<<History>>>\n"+
				"Id: "+n+
				"\nBook Name: "+getName()
				+"\nAuthor: "+getAuthor());
	}
	public String getName() {
		return history_name;
	}
	public void setName() {
		System.out.println("Enter the book name > ");
		history_name = s.nextLine();
	}
	public String getAuthor() {
		return book_author;
	}
	public void setAuthor() {
		System.out.println("Enter the book's author > ");
		book_author = s.nextLine();
	}
}
