import java.util.Scanner;
public class MyDrawing {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num;
		System.out.println("Please input a number:");
		num = s.nextInt();
		int a = 0;
		while(a<num) {
			a++;
			int b = 1;
			while(b<a+1) {
				System.out.print("*");
				b++;
			}
			System.out.println();
		}
		for(int i = 0; i<num ; i++) {
			for(int j = num-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
