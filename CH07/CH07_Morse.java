import java.util.Scanner;

public class CH07_Morse {
	private static String[] morse = {"o-", "-ooo", "-o-o","-oo","o",
									"oo-o","--o","oooo","oo","o---", 
									"-o-","o-oo","--","-o","---", "o--o",
									"--o-","o-o","ooo","-", "oo-","ooo-",
									"o--","-oo-","-o--","--oo"};
	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Java Alphabet-to-Morse converter");
		System.out.print("Type a word: ");
		String word = kb.next();
		
		String morse_code = CH07_Morse.convert(word.toUpperCase());
		System.out.print("Morse Codes: "+ morse_code);
	}
	public static String convert(String word) {
		String m = "";
		
		//65~90
		for(int i = 0; i<word.length(); i++) {
			m+=morse[(int)word.charAt(i)-65];
		}
		return m;
	}
}
