import java.util.Scanner;

public class Temperature
{
	private double t;        // temperature
	private char scale;        // celsius or fahrenheit
	Scanner scan = new Scanner(System.in);
   
	
	// constructors 
    public Temperature(double d) {
	    t = d;
	    scale = 'c';
    }
    public Temperature(char s) {
    	t = 0.0;
    	scale = s;
    }
    public Temperature(double d, char s) {
	    t = d;
	    scale = s;
   }
   public Temperature() {
	   t = 0.0;
	   scale = 'c';
   }
   
   
   // Two accessor method
   public void writeC() {
 	   if(scale == 'f'||scale =='F') {
 		   t = (t-32) * 5/9 ;
 		   scale = 'c';
 	   }
 	   System.out.println(String.format("%.1f", t)+" C");
    }
    public void writeF() {
    	if(scale == 'c'||scale =='C') {
    		t = (t*1.8) + 32;
    		scale = 'f';
    	}
 	   System.out.println(String.format("%.1f", t)+ " F");
    }
  
    
   // three comparsion methods
    public boolean equals(Temperature tem) {
    	if((scale == 'C'|| scale == 'c')&&(tem.scale == 'f'||tem.scale == 'F')) {
    		t = (t*1.8) + 32;
    		scale = 'f';
    		if(t == tem.t) return true;
    		else return false;
    	}
    	else if((scale == 'F'|| scale == 'f')&&(tem.scale == 'C'||tem.scale == 'c')) {
    		t = (t-32) * 5/9 ;
			scale = 'c';
    		if(t == tem.t) return true;
    		else return false;
    	}
    	else if (t == tem.t) return true;
    	else return false;
    }
    public boolean isLessThan(Temperature tem) {
    	if(t < tem.t) return true;
    	else return false;
    }
    public boolean isGreaterThan(Temperature tem) {
    	if(t > tem.t) return true;
    	else return false;
    }
    
    
    // another methods
    public void writeOutput() {
 	   System.out.println(t + " "+scale);
    }
    
    public void readInput() {
 	   System.out.println("Enter the temperature > ");
 	   t = scan.nextDouble();
 	   System.out.println("Enter the unit > ");
 	   String s = scan.next();
 	   scale = s.charAt(0);
 	   
    }

    public double getF() {
    	double f = t;
    	if(scale == 'C'||scale=='c') f = (t*1.8) + 32;
 	    f = Math.round(f*10);
 	    f = f/10;
    	return f;
    }
    public double getC() {
    	double c = t;
    	if(scale == 'F'||scale=='f') c = (t-32) * 5/9;	
    	c = Math.round(c*10);
    	c = c/10;
  	    return c;
    }
    public void set(char s) {
   	   scale = s;
    }  
    public void set(double d, char s) {
 	   t = d;
 	   scale = s;
    }
    public void set(int i) {
	   t = i;
    }
    public void set(double d) {
       t = d;
    }
}