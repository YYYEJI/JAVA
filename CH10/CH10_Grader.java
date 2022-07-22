import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CH10_Grader {
	public static void main(String[] args) {
		String fileName = "Grades.txt";
		String outfileName = "Grades_average.txt";
		CH10_Grader.run(fileName, outfileName);
	}
	public static void run(String s1, String s2) {
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			inputStream = new Scanner(new File(s1));
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+s1);
			System.exit(0);
		}
		
		try {
			outputStream = new PrintWriter(s2);
		}
		catch(FileNotFoundException e) {
			System.out.println("Error opening the file "+s2);
			System.exit(0);
		}
		
		double[] sum = new double[4];
		String first_line = inputStream.nextLine();
		outputStream.println(first_line);
//		System.out.println(first_line);
		while(inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			String[] arr = line.split(",");
			
//			System.out.print(arr[0]+" "+arr[1]+" ");
			outputStream.print(arr[0]+","+arr[1]+",");
			outputStream.print(arr[2]+",");
			outputStream.print(arr[3]+",");
			outputStream.print(arr[4]+",");
			outputStream.print(arr[5]+",");
			
//			System.out.print(arr[2]+" ");
//			System.out.print(arr[3]+" ");
//			System.out.print(arr[4]+" ");
//			System.out.print(arr[5]+" ");
//			
			double each_average = (Double.parseDouble(arr[2])+Double.parseDouble(arr[3])+Double.parseDouble(arr[4])+Double.parseDouble(arr[5]))/4.0;
//			System.out.print(each_average);
			outputStream.print(each_average);
			
			for(int i = 0; i<4; i++) {
				sum[i] += Double.parseDouble(arr[i+2]);
			}
			
			
//			System.out.println("");
			
			outputStream.println();
		}

		for(int i = 0; i<4; i++){
			if(i==0) {
//				System.out.print("Average,000000,");
				outputStream.print("Average,000000,");
			}
//			System.out.print(sum[i]/8.0+" ");
			if(i!=3)
				outputStream.printf(sum[i]/8.0+",");
			else outputStream.print(sum[i]/8.0);
		}
		inputStream.close();
		outputStream.close();
		
	}
}
