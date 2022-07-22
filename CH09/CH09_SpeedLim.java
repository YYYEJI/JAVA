
public class CH09_SpeedLim {
	private int l;       // limit
	private int s;       // speed
	
	CH09_SpeedLim(int a, int b){
		l = a;
		s = b;
	}
	CH09_SpeedLim(){
		l = 0;
		s = 0;
	}
	
	public void speedWarning() {
		try {
			if(l<s) throw new Exception("Speed Limit "+l+"km exceeded!");
			else System.out.println("You are a law abiding citizen!");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("You are being fined.");
		}
		System.out.println("Your current speed: "+s);
	}
}
