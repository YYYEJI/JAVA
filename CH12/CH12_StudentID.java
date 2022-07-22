import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CH12_StudentID {
	public static void main(String[] args){
		HashMap<Integer, ArrayList<String>> stu = new HashMap<Integer, ArrayList<String>> ();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data in the format: ID CourseNum");
		System.out.println("Enter 01 to end.");
		while(true) {
			ArrayList<String> list = new ArrayList<String>();
			int id = s.nextInt();
			if(id == -1) break;
			
			String sub = s.next();
			if(stu.containsKey(id)) {
				list = stu.get(id);
				list.add(sub);
			}else {
				list.add(sub);
			}
			stu.put(id, list);
		}
		printMap(stu);
	}
	public static void printMap(HashMap<Integer,  ArrayList<String>> map) {
		for(Integer keyStudent:map.keySet()) {
			System.out.println("Student: "+keyStudent);
			for(String cour:map.get(keyStudent)) {
				System.out.print(cour+" ");
			}
			System.out.println();
		}
	}
}
