import java.util.Scanner;

public class CH11_RecursionCountOnes {
	public static void main(String[] args) {
		System.out.println("Enter a nonnegative number:");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		System.out.println(number+" contains "+getNumberOfones(number)+" ones.");
	}
	
	public static int getNumberOfones(int n) {
		int result;
		
		if(n==1) result =  1;
		else if(n<10) result = 0;
		else if(n%10==1) result = getNumberOfones(n/10)+1;
		else result = getNumberOfones(n/10);
		
		return result;
	}
}
