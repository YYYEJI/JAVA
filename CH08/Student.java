
public class Student extends Person{
	private int id;        // student number
	
	// contructors
	public Student() {
		super();           // parent class 안에 있는 instance variables 초기
		id = 0;
	}
	public Student(String s, int n) {
		super(s);
		id = n; 
	}
	
	// accessor 
	public int getStudentNumber() {
		return id;
	}
	// mutator
	public void setStudentNumber(int newStudentNumber) {
		id = newStudentNumber;
	}
	
	public void reset(String newName, int newStudentNumber) {
		setName(newName);
		id = newStudentNumber;
	}
	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Student Number: "+id);
	}
	public boolean equals(Student otherStudent) {
		if((this.hasSameName(otherStudent))&& (id== otherStudent.id))
			return true;
		else return false;
	}
	public String toString() {
		return("Name: "+getName()
				+ "\nStudent number: "+id);
	}
}
