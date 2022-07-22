import java.util.*;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner s  = new Scanner (System.in);
		String data;
		String[] date ;
		int month, day, year;
		int check = 0;
		

	    do {
			System.out.println("Enter a date in the format month/day/year.");
			data = s.next();
			date = data.split("/");
			
		    month = Integer.parseInt(date[0]);
		    day = Integer.parseInt(date[1]);
		    year = Integer.parseInt(date[2]);
		    

	    	if(month <= 0 || month >12)	System.out.println("1~12월까지만 입력 가능.");
	    	else if(month == 2) {
	    		if ((year % 4 == 0 && year % 100 != 0)||(year%400 == 0)) {
	    			if((day<=0 || day>=30)) {
	    				System.out.println("윤년이므로 1~29일 까지 가능하므로 유효하지 않음. ");
	    				continue;
	    			}
	    			else {
	    				System.out.println("윤년이므로 유효한 데이터임.");
	    				check = 1;
	    			}
	    			
	    		} 
	    		else {
	    			if(day<=0 || day>=29) {
	    				System.out.println("평년이므로 1~28일 까지 가능하므로 유효하지 않음. ");
	    				continue;
	    			}
	    			else {
	    				System.out.println("평년이므로 유효한 데이터.");
	    				check = 1;
	    			}
	    		}
	
	    	}
	    	else if(month == 1 || month == 3 || month == 5 ||month == 7||month == 8 || month ==10 || month ==12) {
	    		if(day>31 || day<=0) {
	    			System.out.println("1~31일까지만 입력 가능하므로 유효하지 않음. ");
    		    	continue;
    			}
	    		else {
	    			System.out.println("유효한 데이터임.");
	    			check = 1;
	    		}
	    	}
	    	else if(month == 4 || month == 6 || month == 9 || month ==11) {
	    		if(day>30 || day<=0) {
	    		    System.out.println("1~30일까지만 입력 가능하므로 유효하지 않음. ");
	    		    continue;
	    		}
	    		else {
	    			System.out.println("유효한 데이터임.");
	    			check = 1;
	    		}
	    	}
	    }while(check == 0);


	    
	}

}
