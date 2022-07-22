import java.util.Scanner;

public class CH08_Book {
	private String book_name;
	static int id;
	private int n;
	Scanner s = new Scanner(System.in);
	
	public CH08_Book() {
		
	}
	
	public CH08_Book(String s) {
		n = ++id;
		book_name = s;
	}
	public void print() {
		System.out.println("<<<BOOK>>>");
		System.out.println("Id: "+ n);
		System.out.println("Book Name: "+book_name);
	}
	public String toString() {
		return("<<<Book>>>\n"+
				"Id: "+n
				+ "\nBook Name: "+getName());
	}
	public String getName() {
		return book_name;
	}
	public void setName() {
		System.out.println("Enter the book name > ");
		book_name = s.nextLine();
	}
}
