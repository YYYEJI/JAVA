import java.util.Scanner;

public class CH09_SpeedLim_main {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int limit = 0, speed = 0;
		
		System.out.print("Input the speed limit: ");
		limit = s.nextInt();
		
		System.out.print("Input the current speed: ");
		speed = s.nextInt();
		
		CH09_SpeedLim lim = new CH09_SpeedLim(limit, speed);
		lim.speedWarning();
		s.close();
	}
}
