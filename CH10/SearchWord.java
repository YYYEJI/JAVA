import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SearchWord {
	public static void main(String arg[]) {
		String readFile1 = "words.txt";
		String readFile2 = "searchWordList.txt";
		String writeFile = "result.txt";
		Scanner inputStream1 = null;
		Scanner inputStream2 = null;
		PrintWriter outputStream = null;
		String search_word, find_word;
		String[] word = null;
		String[] word_list = new String[4];
		String[] find_words1 = new String[100000];
		String[] find_words2 = new String[100000];
		String[] find_words3 = new String[100000];
		String[] find_words4 = new String[100000];
	
		
		try {
			inputStream1 = new Scanner(new File(readFile1));
			inputStream2 = new Scanner(new File(readFile2));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+" file.");
			System.exit(0);
		}
		try {
			outputStream = new PrintWriter(writeFile);
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+writeFile);
			System.exit(0);
		}
		
		int i = 0;
		while(inputStream2.hasNextLine()) {
			search_word = inputStream2.nextLine();
			word = search_word.split(" ");
			word_list[i] = word[0];
			
			i++;
			
		}
	
		int size1 = 0, size2 = 0, size3 = 0, size4 = 0;
		while(inputStream1.hasNextLine()) {
			find_word = inputStream1.nextLine();
			if(find_word.contains(word_list[0])) {
				find_words1[size1] = find_word;
				size1++;
			}
			if(find_word.contains(word_list[1])) {
				find_words2[size2] = find_word;
				size2++;
			}
			if(find_word.contains(word_list[2])) {
				find_words3[size3] = find_word;
				size3++;
			}
			if(find_word.contains(word_list[3])) {
				find_words4[size4] = find_word;
				size4++;
			}
			
		}
		int size = 0;
//		System.out.println("## Word list containing String \""+word_list[0]+"\" ##");
		outputStream.println("## Word list containing String \""+word_list[0]+"\" ##");
		for(size = 0; size < size1; size++) {
//			System.out.println(find_words1[size]);
			outputStream.println(find_words1[size]);
		}
		
//		System.out.println("\n\n## Word list containing String \""+word_list[1]+"\" ##");
		outputStream.println("\n\n## Word list containing String \""+word_list[1]+"\" ##");
		for(size = 0; size < size2; size++) {
//			System.out.println(find_words2[size]);
			outputStream.println(find_words2[size]);
		}
		
//		System.out.println("\n\n## Word list containing String \""+word_list[2]+"\" ##");
		outputStream.println("\n\n## Word list containing String \""+word_list[2]+"\" ##");
		for(size = 0; size < size3; size++) {
//			System.out.println(find_words3[size]);
			outputStream.println(find_words3[size]);
		}
		
//		System.out.println("\n\n## Word list containing String \""+word_list[3]+"\" ##");
		outputStream.println("\n\n## Word list containing String \""+word_list[3]+"\" ##");
		for(size = 0; size < size4; size++) {
//			System.out.println(find_words4[size]);
			outputStream.println(find_words4[size]);
		}
		
		
		inputStream1.close();
		inputStream2.close();	
		outputStream.close();
	}
}
