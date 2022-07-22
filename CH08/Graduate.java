
public class Graduate extends Student{
	private int level;
	
	public Graduate(String s, int n1, int n2) {
		super(s, n1);
		level = n2;
	}
	// accessor
	public int getLevel() {
		return level;
	}
	// mutator
	public void setLevel(int newLevel) {
		level = newLevel;
	}
	
	public void reset(String newName, int newStudentNumber, int newlevel) {
		setName(newName);
		setStudentNumber(newStudentNumber);
		level = newlevel;
	}
	public void writeOutput() {
		System.out.println("Name: "+ getName());
		System.out.println("Student Number: "+ getStudentNumber());
		System.out.println("Student Level: "+level);
	}
	public boolean equals(Graduate otherUndergraduate) {
		if(	this.equals(otherUndergraduate)&&
				level== otherUndergraduate.level) 
			return true;
		else return false;
	}
	public String toString() {
		return("Name: "+getName()
				+ "\nStudent number: "+getStudentNumber()
				+ "\nStudent Level: "+level);
	}
}
