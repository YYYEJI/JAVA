import java.util.Scanner;

public class AlphabeticalOrder {
	
	public static void main(String[] args) {
		String sentence;
		String answer;
		Scanner s = new Scanner(System.in);
//		int [] index = new int[26];
		
		do {
			int [] index = new int[26];
			System.out.println("Enter a line of text");
			System.out.println("terminated by a period.");
			sentence = s.nextLine();
			
			sentence = sentence.replaceAll("\\s","");
			sentence = sentence.toUpperCase();
			
//			System.out.println(sentence);       // 확인용 
			
			
			for(int i = 0; i<sentence.length(); i++) {
				if(sentence.charAt(i)=='.') break;
				int n = anIndex(sentence.charAt(i));
				index[n]++;
			}
			
			for(int i = 0; i<26; i++) {
				if(index[i] == 0) continue;
				System.out.println((char)(i+65)+" "+index[i]);
			}
			
			System.out.println("Enter another line? (y for 'yes') ");
			answer = s.nextLine();
			
		}while(answer.equals("y")|| answer.equals("Y"));
		
	}
	public static int anIndex(char a) {
		return ((int)a)-65;		
	}
}
