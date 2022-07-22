import java.util.Scanner;
public class CH09_MyException_main {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		try {
			String str = s.nextLine();
			MyTest(str);
		}
		catch(CH09_MyException mae) {
			System.out.println(mae);
		}
		s.close();
	}
	static void MyTest(String str) throws CH09_MyException{
			if(str.contains("$")) {
				throw new CH09_MyException();
//				System.out.println("special character $.");
			}
			else System.out.println("String :"+str);
	
	}
}
