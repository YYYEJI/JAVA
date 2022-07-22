import java.util.Scanner;

public class My4BitBinaryToDigit{
	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a four bit binary value.");
		String num = scan.next();
		int sti;   // string to integer
		int bit = 0;
		
		if(num.substring(3,4).equals("1")){   // 첫번째 bit
			sti = Integer.parseInt(num.substring(3,4)); 
			bit += 1;
//			System.out.println("1 "+bit);
		}
		if(num.substring(2,3).equals("1")) { 
			sti = Integer.parseInt(num.substring(2,3)); 
			bit += 2;
//			System.out.println("2 "+bit);
		}
		if(num.substring(1,2).equals("1")) {
			sti = Integer.parseInt(num.substring(1,2)); 
			bit += 4;
//			System.out.println("3 "+bit);
		}		
		if(num.substring(0,1).equals("1")) {
			sti = Integer.parseInt(num.substring(0,1)); 
			bit += 8;
//			System.out.println("4 "+bit);
		}
		
		
		System.out.printf("The value of %s is %d", num, bit);
	}
}
