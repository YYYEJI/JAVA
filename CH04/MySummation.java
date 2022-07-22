import java.util.Scanner;
public class MySummation {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num;
		int sum = 0;
		System.out.println("Please input a number: ");
		num = s.nextInt();
		
		for(int i = 1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("The summation from 1 to "+num+" is");
		System.out.println(sum);
	}
}
