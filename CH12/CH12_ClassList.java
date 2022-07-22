import java.util.ArrayList;

public class CH12_ClassList {
	ArrayList <String> className = new ArrayList <String> ();
	
	public void add(String s) {
		className.add(s);
	}
	public void Print() {
		System.out.println("\nList of classes");
		int cnt = 1;
		for (String key: className) {
			System.out.printf("cass %d: %s\n", cnt, key);
			cnt++;
		}
	}
}
