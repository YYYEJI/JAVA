import java.util.Scanner;

public class GradeDistribution {
	Scanner s = new Scanner (System.in);
	private int gradeA;
	private int gradeB; 
	private int gradeC;
	private int gradeD;
	private int gradeF;
	
	public static void main(String [] args) {
		GradeDistribution grade = new GradeDistribution();
		
		grade.drawGrade();
		
	}
	public void setGrade() {
		System.out.println("Enter number of A grade > ");
		this.gradeA = s.nextInt();
		System.out.println("Enter number of B grade > ");
		this.gradeB = s.nextInt();
		System.out.println("Enter number of C grade > ");
		this.gradeC = s.nextInt();
		System.out.println("Enter number of D grade > ");
		this.gradeD = s.nextInt();
		System.out.println("Enter number of F grade > ");
		this.gradeF = s.nextInt();
	}
	
	public int getGrade(char s) {
		if (s == 'A') return gradeA;
		else if(s == 'B') return gradeB;
		else if(s == 'C') return gradeC;
		else if(s == 'D') return gradeD;
		else return gradeF;
	}
	

	
	public int totalGrade() {
		int total = gradeA+gradeB+gradeC+gradeD+gradeF;
		return total;
	}
	
	public int percentageGrade(int n) {
		int total = totalGrade();
		int percentage = (int)(((double)n/total)*100);
//		System.out.println((int)(((double)n/total)*100));    // 확인용 

		return percentage;
	}
	
	public void drawGrade() {
		GradeDistribution grade = new GradeDistribution();
		int percentageA, percentageB, percentageC, percentageD, percentageF;
		grade.setGrade();
	
		System.out.println("");
		for(int i = 0; i<101; i+=10) {
			if(i<95) System.out.print(i+"        ");
			else System.out.print(i);
		}
		System.out.println("%");
		for(int i = 0; i<101; i+=10) {
			System.out.print("|         ");
		}
		System.out.println("");
		for(int i = 0; i<51; i++) {
			System.out.print("* ");
		}
		System.out.println("");
		

		
		percentageA = grade.percentageGrade(grade.getGrade('A'));
		percentageB = grade.percentageGrade(grade.getGrade('B'));
		percentageC = grade.percentageGrade(grade.getGrade('C'));
		percentageD = grade.percentageGrade(grade.getGrade('D'));
		percentageF = grade.percentageGrade(grade.getGrade('F'));
//		System.out.println(percentageA);
		
		
//		System.out.println(percentageA);
		for(int i  = 0; i<percentageA/2+1; i++) {
			System.out.print("* ");
		}
		System.out.println("  A");

		for(int i  = 0; i<percentageB/2+1; i++) {
			System.out.print("* ");
		}
		System.out.println("  B");

		for(int i  = 0; i<percentageC/2+1; i++) {
			System.out.print("* ");
		}
		System.out.println("  C");
		
		for(int i  = 0; i<percentageD/2+1; i++) {
			System.out.print("* ");
		}
		System.out.println("  D");
		
		for(int i  = 0; i<percentageF/2+1; i++) {
			System.out.print("* ");
		}
		System.out.println("  F");
	}
	
}
