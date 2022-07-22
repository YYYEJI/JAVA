import java.util.*;
import javax.swing.*;

public class EnterADate {
	public static void main(String[] args) {
		String data;
		data = JOptionPane.showInputDialog(null,"Enter a date in the format month/day/year.\nI will output the date in the format day.month.year\n","Input", JOptionPane.OK_CANCEL_OPTION);
		
		String[] date = data.split("/");
		
	    int month = Integer.parseInt(date[0]);
	    int day = Integer.parseInt(date[1]);
	    int year = Integer.parseInt(date[2]);
	    
	    switch(month){	     	
	    	case 1 :
	    	case 3 :
	    	case 5 :
	    	case 7 :
	    	case 8 :
	    	case 10 :
	    	case 12 :
	    		if(day>31 || day<=0) {
	    		    int result2 = JOptionPane.showConfirmDialog( null,  "Day 잘못 입력 ",
	    		            "Error", JOptionPane.OK_CANCEL_OPTION);
	    		}
	    		break;
	    	case 2 :
	    		if(day>28 || day<=0) {
	    		    int result3 = JOptionPane.showConfirmDialog( null,  "Day 잘못 입력 ",
	    		            "Error", JOptionPane.OK_CANCEL_OPTION);
	    		}
	    		break;
	    	case 4:
	    	case 6:
	    	case 9:
	    	case 11:
	    		if(day>30 || day<=0) {
	    		    int result4 = JOptionPane.showConfirmDialog( null,  "Day 잘못 입력 ",
	    		            "Error", JOptionPane.OK_CANCEL_OPTION);
	    		}
	    		break;
	    	default : 
	    	    int result5 = JOptionPane.showConfirmDialog( null, "Month 잘못 입력 ",
	    	            "Error", JOptionPane.DEFAULT_OPTION);
	    		
	    	    break;
	    		
	    }
	    
	    if(month>=1 && month<=12) {
	    	int result6 = JOptionPane.showConfirmDialog( null, data+" converts to: "+ date[1]+"."+date[0]+"."+date[2],
	            "Message", JOptionPane.DEFAULT_OPTION);
	    }
	    int result7 = JOptionPane.showConfirmDialog( null,  "프로그램을 종료하시겠습니까?",
	            "종료 ", JOptionPane.OK_CANCEL_OPTION);
	    
		System.exit(0);
	}

}
