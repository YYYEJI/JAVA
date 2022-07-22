
public class CH05_MySalary {
	private double bsal;
	public static void main(String[] agrs) {
		CH05_MySalary testSal = new CH05_MySalary();
		
		testSal.setBasic();
		System.out.println("After setBasic() testSal = "+testSal.salaryIs());
		
		int j,k;
		String junk;
		for(j = 0; j<3; j++) {
			System.out.println("Loop count = "+j);
			testSal.promote();
			System.out.println("After promote() in loop "+"using printSalarty(): ");
			testSal.printSalary();
			System.out.println("Using salaryIs() to return value: "+testSal.salaryIs());
			
		}
		for(k = 0; k<3; k++) {
			System.out.println("Loop count = "+k);
			testSal.demote();
			System.out.println("After demote() in loop "+"using printSalary(): ");
			testSal.printSalary();
			System.out.println("Using salaryIs () to return value: "+testSal.salaryIs());
		}
	}
	public void setBasic() {
		this.bsal = 5000;
	}
	public double salaryIs() {
		return this.bsal;
	}
	public void promote() {
		bsal = this.bsal + this.bsal * 0.1;
	}
	public void demote() {
		bsal = this.bsal * 0.9;
	}
	public void printSalary() {
		System.out.println("Salary = "+this.bsal);
	}
}
