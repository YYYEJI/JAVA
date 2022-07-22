

public class CH06_EnumTest{
	
	
	public static void main(String[] args) {
		Suit s = Suit.FRI;
		System.out.println("s.ordinal()="+s.ordinal());
		
		System.out.println("s.compareTo(Suit.WED)="+s.compareTo(Suit.WED));
		
		System.out.println("s.toString()="+s.toString());
		System.out.println("s.getColor()="+s.getColor());
		
		for(Suit status:Suit.values()) {
			System.out.println(status + " " + status.getColor());
			
		}
	}
}