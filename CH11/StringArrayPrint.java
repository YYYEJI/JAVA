
public class StringArrayPrint {
	public static void main(String agrs[]){
		String s="";
		String[][] data1 = {{"A","B"},
				   			{"1","2"},
				   			{"XX","YY","ZZ"}};
		String[][] data2 = {{"A"},
				   			{"1"},
				   			{"2"},
				   			{"XX","YY"}};
		String[][] data3 = {{"A","B"},
			       			{"1","3"},
			       			{"2"},
			       			{"XX","YY"}};
		
		print_data(data1, 0, s);
		System.out.println("");
		print_data(data2, 0, s);
		System.out.println("");
		print_data(data3, 0, s);
		System.out.println("");
	}
	
	public static void print_data(String[][] list, int n, String s) {
		if(n == list.length) {
			System.out.println(s);
			return;
		}
		for(int i = 0; i<list[n].length; i++) {
			String result;
			if(s == "") result = list[n][i];
			else result = s + " " + list[n][i];
			print_data(list, n+1, result);
			
		}
		
	}

}
