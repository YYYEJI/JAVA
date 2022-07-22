import java.util.Scanner;
import java.io.*;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileInputStream;
//import java.io.FileWriter;
//import java.io.IOException;


public class CH10_FirstWordRemover {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		String readFile, writeFile;
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		
		System.out.println("What is the file to read from? ");
		readFile = s.nextLine();
		System.out.println("What is the file to write to (after removing the first word from each line) ");
		writeFile = s.nextLine();
		
		try {
			inputStream = new Scanner(new File(readFile));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+readFile);
			System.exit(0);
		}
		
		try {
			outputStream = new PrintWriter(writeFile);
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+writeFile);
			System.exit(0);
		}
		
		while(inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			String[] arr = line.split(" ");
			
			for(int i = 1; i<arr.length; i++) {
				outputStream.print(arr[i]+" ");
			}
			outputStream.println();
		}
		inputStream.close();
		outputStream.close();
		System.out.println("File processing completed.");
		
	}
	
}



