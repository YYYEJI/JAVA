
public class Staff extends Employee2 {
	private int pay;         // pay grade
	
	// constructor
	public Staff(String s1, String s2, int n1, int n2) {
		super(s1, s2, n1);
		pay = n2;
	}
	public Staff() {
		super();
		pay = 0;
	}
	// accessor
	public int getPay() {
		return pay;
	}
	// mutator
	public void setPay(int newPay) {
		pay = newPay;
	}
	
	
	public void reset(String newName, String newDept, int newId, int newPay ) {
		setName(newName);
		setDept(newDept);
		setEmployeeId(newId);
		pay = newPay;
	}
	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Dept: " + getDept());
		System.out.println("Employee ID: " + getEmployeeId());
		System.out.println("Pay Grade: " + pay);
	}
	public boolean equals(Staff otherStaff) {
		if(this.equals(otherStaff)&&
				pay == otherStaff.pay)
			return true;
		else return false;
	}
	public String toString() {
		return("Name: "+getName()
				+ "\nDept: "+getDept()
				+ "\nEmployee ID: "+getEmployeeId()
				+ "\nPay Grade: "+pay);
	}
}
