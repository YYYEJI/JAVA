import java.util.Scanner;

public class MyKoreanChangeMaker{
	public static void main(String [] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println("Enter a whole number from 1 to 10000.");
		int amount = sca.nextInt();
		int originalAmount, num1 = 0, num2 = 0,num3 = 0, num4 = 0, num5 = 0; 
		originalAmount = amount;
		
		num1 = amount/500;
		amount = amount%500;
		num2 = amount/100;
		amount = amount%100;
		num3 = amount/10;
		amount = amount%10;
		num4 = amount/5;
		amount = amount%5;
		num5 = amount/1;
		amount = amount%1;
		
		
		System.out.printf("%d won in coins can be given as:\n", originalAmount);
		System.out.printf("%d 500 won\n", num1);
		System.out.printf("%d 100 won\n", num2);
		System.out.printf("%d 10 won\n", num3);
		System.out.printf("%d 5 won\n", num4);
		System.out.printf("%d 1 won\n", num5);
		
		
		
		
		
	}
}
