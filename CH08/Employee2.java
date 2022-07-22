
public class Employee2 extends Person{
	private String dept;
	private int id;
	
	// constructor
	public Employee2(String s1, String s2, int n) {
		super(s1);
		dept = s2;
		id = n;
	}
	public Employee2() {
		super();
		dept = "";
		id = 0;
	}
	// accessor
	public String getDept() {
		return dept;
	}
	public int getEmployeeId() {
		return id;
	}
	// mutator
	public void setDept(String newDept) {
		dept = newDept;
	}
	public void setEmployeeId(int newId) {
		id = newId;
	}
	public void reset(String newName, String newDept, int newId) {
		setName(newName);
		dept = newDept;
		id = newId;
	}
	public void writeOutput() {
		System.out.println("Name: "+getName());
		System.out.println("Dept: "+dept);
		System.out.println("Employee ID: "+id);
	}
	public boolean equals(Employee2 otherEmployee) {
		if(this.hasSameName(otherEmployee) 
				&& dept.equals(otherEmployee.dept)
				&& id == otherEmployee.id) return true;
		else return false;
	}
	public String toString() {
		return("Name: "+getName()
				+"Dept: "+dept
				+ "\nEmployee ID: "+id);
	}
	
}
