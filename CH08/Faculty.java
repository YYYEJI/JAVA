
public class Faculty extends Employee2 {
	private String title;
	
	// constructor
	public Faculty(String s1, String s2, int n, String s3) {
		super(s1, s2, n);
		title = s3;
	}
	public Faculty() {
		super();
		title = "";
	}
	// accessor
	public String getTitle() {
		return title;
	}
	//mutator
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	
	public void reset(String newName, String newDept, int newId, String newTitle) {
		setName(newName);
		setDept(newDept);
		setEmployeeId(newId);
		title = newTitle;
	}
	public void writeOutput() {
		System.out.println("Name: "+getName());
		System.out.println("Dept: "+getDept());
		System.out.println("Employee ID: "+getEmployeeId());
		System.out.println("Title: "+title);
	}
	public boolean euqals(Faculty otherFaculty) {
		if(this.equals(otherFaculty)&&
				title.equals(otherFaculty.title)) return true;
		else return false;
	}
	public String toString() {
		return("Name: "+getName()
				+ "\nDept: "+getDept()
				+ "\nEmployee ID: "+getEmployeeId()
				+ "\nTitle: "+title);
	}
	
}
