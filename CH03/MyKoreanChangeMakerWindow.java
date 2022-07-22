import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.*;

public class MyKoreanChangeMakerWindow {
	enum Weeks {Mon, TUE, WED, THR, FRI, SAT, SUN}
	public static void main(String[] args) {
		Weeks[] arr = Weeks.values();
		int won500, won100, won10, won5, won1;
		
		String koreanWon;
		koreanWon = JOptionPane.showInputDialog(null,"Enter a whole number from 1 to 10000.","입력", JOptionPane.OK_CANCEL_OPTION);
		
		int won = Integer.parseInt(koreanWon);
		won500 = won/500;
		won = won%500;
		won100 = won/100;
		won = won%100;
		won10 = won/10;
		won = won%10;
		won5 = won/5;
		won = won%5;
		won1 = won/1;
		won = won%1;
		
		int result = JOptionPane.showConfirmDialog( null, koreanWon+" won in coins can be given as:\n"
																	+won500+" 500 won\n"
																	+won100+" 100 won\n"
																	+won10 +" 10 won\n"
																	+won5  +" 5 won\n"
																	+won1  +" 1 won\n",
																	"메세지", JOptionPane.DEFAULT_OPTION);
		
	}
}
