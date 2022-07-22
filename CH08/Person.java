
public class Person {
	private String name;
	
	//constructor
	public Person() {
		name = "No name yet";
	}
	public Person(String n) {
		name = n;
	}
	// accessor
	public String getName() {
		return name;
	}
	// mutator
	public void setName(String newName) {
		name = newName;
	}
	
	public void writeOutput() {
		System.out.println("Name: "+name);
	}
	public boolean hasSameName(Person otherPerson) {    // equals method
		if( name.equals(otherPerson.name)) return true;
		else return false;
	}
	public String toString() {
		return ("Name: "+name);
	}
}
