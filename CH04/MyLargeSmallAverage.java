import java.util.Scanner;

public class MyLargeSmallAverage {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int n;
		int cnt = 0, sum = 0;
		int max = 0, min = 0;
		double avg;
		
		System.out.printf("This program allows you to enter a list of positive integers\n(terminated by a -1) then displays the largest value, smallest value, and average of the list of number,\n not including the final (negative) value that ends the list.\n\n"
				+ "");
		
		do {
			System.out.println("Please enter a positive integer, or -1 to quit.");
			n = s.nextInt();
			  if(n>0) {
				if(cnt == 0 ) {
					max = n;
					min = n;
				}
				else {
					if(max<n) max = n;
					if(min>n) min = n;
				}
				sum+=n;
				cnt++;
			}
		}while(n>0);
		avg = (double)sum/(double)cnt;
		System.out.println("For the "+cnt+" numbers you entered");
		System.out.println("the largest value = "+max);
		System.out.println("the smallest value = "+min);
		System.out.println("and the average is = "+avg);
	}
}
