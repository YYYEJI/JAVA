
public class CH08_Science extends CH08_Book{
	private String science_name;
	private String book_publisher;
	private int n;
	
	public CH08_Science(String s1, String s2) {
		n = ++id;
		science_name = s1;
		book_publisher = s2;
	}
	public void print() {
		System.out.println("<<<Science>>>");
		System.out.println("Id: "+ n);
		System.out.println("Book Name: "+science_name);
		System.out.println("Publisher: "+book_publisher);
	}
	public String toString() {
		return("<<<Science>>>\n"+
				"Id: "+n
				+"\nBook Name: "+getName()
				+"\npublisher: "+getPublisher());
	}
	public String getName() {
		return science_name;
	}
	public void setName() {
		System.out.println("Enter the book name > ");
		science_name = s.nextLine();
	}
	public String getPublisher() {
		return book_publisher;
	}
	public void setPublisher() {
		System.out.println("Enter the book's publisher > ");
		book_publisher = s.nextLine();
	}
	
}
