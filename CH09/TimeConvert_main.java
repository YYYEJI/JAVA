import java.util.Scanner;

public class TimeConvert_main {
	public static void main(String [] args) throws TimeFormatException{
		Scanner s = new Scanner(System.in);
		String sentence;
		String answer;
		String[] result;	
		String when;
		
		while(true) {
			System.out.println("Enter time in 24-hour notation:");
			sentence = s.nextLine();
			result = sentence.split(":"); 
			
//			System.out.println(result[0]);      // 시간(시) 확인용 
//			System.out.println(result[1]);      // 시간(분) 확인용 
			
			int hour = Integer.parseInt(result[0]);
			int minute = Integer.parseInt(result[1]);
			TimeFormatException time = new TimeFormatException(hour, minute);
			
			if((hour>24||hour<=0)||(minute>60||minute<0)) {
				time.errorTime();
			}
			else {
				if(hour>12) {
					hour = hour-12;
					when = "PM";
				}
				else when = "AM";
				
				System.out.println("That is the same as");
				if(minute<10)
					System.out.println(hour+":0"+minute+" "+when);
				else
					System.out.println(hour+":"+minute+" "+when);
				System.out.println("Again? (y/n)");
				
				answer = s.nextLine();	
				if(answer.equalsIgnoreCase("N")) {
					System.out.println("End of program");
					break;
				}
			}
			
		}
		
		s.close();
	}
}
