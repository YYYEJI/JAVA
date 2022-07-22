import java.util.Scanner;

public class CH11_Palindrome_main {

	public static void main(String[]args)
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sca.nextLine();
        
        if(palindrome(s))
            System.out.println(s + " is a palindrome.");
        else
            System.out.println(s + " is not a palindrome.");
    }
   
    public static boolean palindrome(String s)
    {  
    	s = s.toLowerCase();
        if(s.length() == 0 || s.length() == 1) 
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        	return palindrome(s.substring(1, s.length()-1));
        
        return false;
         
    }	
}
