
public class CH05_MyPassFail {
	private String name;
	private int score;
	public static void main(String[] args) {
		System.out.println("Before copying\n");
		String name = "Hongkildong";
		CH05_MyPassFail student1 = new CH05_MyPassFail();
		CH05_MyPassFail student2 = new CH05_MyPassFail();
		student1.setdata(name, 80);
		student2.setdata("KimChulSoo", 40);
		CH05_MyPassFail.identifyOrSameValue(student1, student2);
		
		student1.writeoutput();
		student2.writeoutput();
		System.out.println("Hashcode of student1: "+student1.toString());
		System.out.println("Hashcode of student2: "+student2.toString());
		
		student1.copyFrom(student2);
		
		System.out.println("\n\nAfter copyting\n");
		CH05_MyPassFail.identifyOrSameValue(student1, student2);
		
		student1.writeoutput();
		student2.writeoutput();
		System.out.println("Hashcode of student1: "+student1.toString());
		System.out.println("Hashcode of student2: "+student2.toString());
		
		System.out.println("\n\nAfter assigning the variable\n");
		
		student1.setdata("HonkilDong", 80);
		student2.setdata("Kimchulsoo", 40);
		student1 = student2;
		CH05_MyPassFail.identifyOrSameValue(student1, student2);
		
		student1.writeoutput();
		student2.writeoutput();
		System.out.println("Hashcode of student1: "+student1.toString());
		System.out.println("Hashcode of student2: "+student2.toString());
	}
	
	public static void identifyOrSameValue(CH05_MyPassFail student1, CH05_MyPassFail student2) {
		if(student1 != student2) {
			System.out.println("Student1 and Student2 are different object, different hashcode");
		}
		else {
			System.out.println("Student1 and Student2 are Same object, Same Hashcode");
			
		}
		if(student1.equals( student2)) System.out.println("Student1 and Student2 have Same state, Same value of instance variable");
		else System.out.println("Student1 and Student2 have different value of instance variables");
	}
	public void writeoutput() {
		String grade;
		if(score > 50) grade = "pass";
		else grade = "fail";
		System.out.println(name+": "+score+": "+grade);
	}
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
	public void setdata(String s_name, int s_score) {
		name = s_name;
		score = s_score;
	}
	public boolean equals( CH05_MyPassFail student) {
		if(name == student.name && score==student.score) return true;
		else return false;
	}
	public void copyFrom(CH05_MyPassFail in_object) {
		name = in_object.name;
		score = in_object.score;
	}
	public String toString() {
	    return getClass().getName()+"@"+Integer.toString(hashCode());
	}
	
}
