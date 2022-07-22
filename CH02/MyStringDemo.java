import java.util.Scanner;

public class MyStringDemo{
	public static void main(String [] args) {
		Scanner sca = new Scanner (System.in);
		String sentence = "Jesus Christ Is My Savior";
		int position;
		
		System.out.println(sentence);
		System.out.println("012345678901234567890123456");
		
		position = sentence.indexOf("Savior");
		System.out.printf("The word \"Savior\" starts at index %d\n", position);
		sentence = sentence.substring(0, position)+"friend";
		System.out.printf("The changed string is:\n");
		System.out.println(sentence);
		sentence = sentence.replace("friend", "joy");
		sentence = sentence.toUpperCase();
		System.out.println(sentence);
		
	}
}




