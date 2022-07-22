import java.util.*;
import javax.swing.*;

public class LeapYear {
	public static void main(String[] args) {
		String data;
		data = JOptionPane.showInputDialog(null,"Enter a date in the format month/day/year.","Input", JOptionPane.OK_CANCEL_OPTION);
		
		String[] date = data.split("/");
		
	    int month = Integer.parseInt(date[0]);
	    int day = Integer.parseInt(date[1]);
	    int year = Integer.parseInt(date[2]);
	    
	    switch(month){	   
	    	case 2 :
	    		if ((year % 4 == 0 && year % 100 != 0)||(year%400 == 0)) {
	    			if((day<=0 || day>=30)) {
	    				int result2 = JOptionPane.showConfirmDialog( null,  "윤년이므로 1~29일 까지 가능하므로 유효하지 않음. ",
		    		            "Error", JOptionPane.OK_CANCEL_OPTION);
	    			}
	    			
	    		} else {
	    			if(day<=0 || day>=29) {
	    			 int result2 = JOptionPane.showConfirmDialog( null,  "평년이므로 1~28일 까지 가능하므로 유효하지 않음. ",
		    		            "Error", JOptionPane.OK_CANCEL_OPTION);
	    			}
	    		}
	    		break;
	    	case 1 :
	    	case 3 :
	    	case 5 :
	    	case 7 :
	    	case 8 :
	    	case 10 :
	    	case 12 :
	    		if(day>31 || day<=0) {
	    		    int result2 = JOptionPane.showConfirmDialog( null,  "1~31일까지만 입력 가능하므로 유효하지 않음. ",
	    		            "Error", JOptionPane.OK_CANCEL_OPTION);
	    		}
	    		break;
	    	case 4:
	    	case 6:
	    	case 9:
	    	case 11:
	    		if(day>30 || day<=0) {
	    		    int result4 = JOptionPane.showConfirmDialog( null,  "1~30일까지만 입력 가능하므로 유효하지 않음. ",
	    		            "Error", JOptionPane.OK_CANCEL_OPTION);
	    		}
	    		break;
	    	default : 
	    	    int result5 = JOptionPane.showConfirmDialog( null, "달은 1~12달만 존재하므로 유효하지 않음. ",
	    	            "Error", JOptionPane.DEFAULT_OPTION);
	    		
	    	    break;
	    		
	    }
	    if(month>=1 && month<=12) {
		    switch(month){	   
	    	case 2 :
	    		if ((year % 4 == 0 && year % 100 != 0)||(year%400 == 0)) {
	    			if((day>0 && day<30)) {
	    				int result2 = JOptionPane.showConfirmDialog( null,  "윤년이므로 유효한 데이터임. ",
		    		            "GOOD", JOptionPane.OK_CANCEL_OPTION);
	    			}
	    			
	    		} else {
	    			if(day>1 && day<=28) {
	    				int result2 = JOptionPane.showConfirmDialog( null,  "평년이므로 유효한 데이터임.  ",
		    		            "GOOD", JOptionPane.OK_CANCEL_OPTION);
	    			}
	    		}
	    		break;
	    	case 1 :
	    	case 3 :
	    	case 5 :
	    	case 7 :
	    	case 8 :
	    	case 10 :
	    	case 12 :
	    		if(day>0 && day<=31) {
	    		    int result2 = JOptionPane.showConfirmDialog( null,  "유효한 데이터임. ",
	    		            "GOOD", JOptionPane.OK_CANCEL_OPTION);
	    		}
	    		break;
	    	case 4:
	    	case 6:
	    	case 9:
	    	case 11:
	    		if(day>0 && day<=30) {
	    		    int result4 = JOptionPane.showConfirmDialog( null,  "유효한 데이터임. ",
	    		            "GOOD", JOptionPane.OK_CANCEL_OPTION);
	    		}
	    		break;
	    	default : 
	    	    break;
	    		
		    }
	    }



	    int result7 = JOptionPane.showConfirmDialog( null,  "프로그램을 종료하시겠습니까?",
	            "종료 ", JOptionPane.OK_CANCEL_OPTION);
	    
		System.exit(0);
	}

}
