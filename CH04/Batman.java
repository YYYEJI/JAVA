import java.util.Scanner;
public class Batman {
	public static void main(String[] agrs) {
		Scanner s = new Scanner (System.in);
		int num1, num2, num3, num4;
		String num, index1, index2, index3, index4;  
		int sum_digit = 0; // 각 자리 숫자의 
		System.out.println("Holy digits Batman! The Riddler is planning his next caper somewhere on Pennsylvania Avenue. \nIn his usual sporting fashion, he has left the address in the form of a puzzle. \nThe address on Pennsylvania is a four digit number where:");
		System.out.println(" * All four digits are different");
		System.out.println(" * The digit in the thousands place is three times the digit in the tens place");
		System.out.println(" * The number is odd");
		System.out.println(" * The sum of the digits is 27\n");
		
		for(int i = 1000; i<=9999; i++) {
			num = String.valueOf(i);
			index1 = num.substring(0);    // 천의 자리 digit 
			index2 = num.substring(1);    // 백의 자리 digit
			index3 = num.substring(2);    // 십의 자리 digit
			index4 = num.substring(3);    // 일의 자리 digit
			
			num1 = Integer.parseInt(index1)/1000;
			num2 = Integer.parseInt(index2)/100;
			num3 = Integer.parseInt(index3)/10;
			num4 = Integer.parseInt(index4);
//			System.out.println(num1+" "+num2+" "+num3+" "+num4);         // 확인용 
			sum_digit=num1+num2+num3+num4;
//		    System.out.println(sum_digit);                               // 확인용 
			if(num1 != num3*3) {
//				System.out.println(num1+" "+num2+" "+num3+" "+num4);     // 확인용 
				continue;       // 10의 자리 * 3 이 1000의 자리가 아니면 넘어가기 
			}
			else if(Integer.parseInt(index4)==0 || Integer.parseInt(index4)==2 || Integer.parseInt(index4) == 4||Integer.parseInt(index4) == 6||Integer.parseInt(index4)==8) {
//				System.out.println(num1+" "+num2+" "+num3+" "+num4);     // 확인용 
				continue;    // 짝수면 넘어가
			}
			else if(num1 == num2 || num1 == num3 || num1 == num4 ||
					num2 == num3 || num2 == num4 || num3 == num4) {
//				System.out.println(num1+" "+num2+" "+num3+" "+num4);     // 확인용 
				continue;   // 4 digit 중 하나라도 같으면 넘어가기
			}
			else if(sum_digit!=27) {
//				System.out.println(num1+" "+num2+" "+num3+" "+num4);     // 확인용 
				continue;
			}
			else {
				System.out.printf("The address is "+num1+num2+num3+num4);
				break;
			}
		}
	}
}
