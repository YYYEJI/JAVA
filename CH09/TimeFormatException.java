
public class TimeFormatException extends Exception{
	private int h;
	private int m;
	
	public TimeFormatException(int h1, int m1) {
		h = h1;
		m = m1;
	}
	public TimeFormatException() {
		h = 0;
		m = 0;
	}
	public void errorTime() {
		try {
			throw new Exception("There is no such time as "+h+":"+m);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Try Again:");
		}
		
	}
}
