
public class CH06b_StrCalculator {
	public static void main(String[] args) {
		double result = 0.0;
		result = CH06b_StrCalculator.operation(10,'+',20);
		System.out.println("Int op Int: "+result);
		
		result = CH06b_StrCalculator.operation("10",'+',"20");
		System.out.println("Str op Str: "+result);
		
		result = CH06b_StrCalculator.operation(10.0, '-',20.0);
		System.out.println("Double op Double: "+result);
				
	}
	public static double operation(int n1, char s, int n2) {
		if(s == '+') return (double)(n1+n2);
		else if (s == '-') return (double)(n1-n2);
		else if (s == '*') return (double)(n1*n2);
		else if (s == '/') return (double)(n1/n2);
		else return 0.0;
	}
	public static double operation(String n1, char s, String n2) {
		double num1, num2;
		if(s == '+') {
			num1 = Double.parseDouble(n1);
			num2 = Double.parseDouble(n2);
			return (num1 + num2);
		}
		else if (s == '-') {
			num1 = Double.parseDouble(n1);
			num2 = Double.parseDouble(n2);
			return (num1 - num2);
		}
		else if (s == '*') {
			num1 = Double.parseDouble(n1);
			num2 = Double.parseDouble(n2);
			return (num1 * num2);
		}
		else if (s == '/') {
			num1 = Double.parseDouble(n1);
			num2 = Double.parseDouble(n2);
			return (num1 / num2);
		}
		else return 0.0;
	}
	public static double operation(double n1,char s, double n2) {
		if(s == '+') return n1+n2;
		else if (s == '-') return n1-n2;
		else if (s == '*') return n1*n2;
		else if (s == '/') return n1/n2;
		return 0.0;
	}
	
}
