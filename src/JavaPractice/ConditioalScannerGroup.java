package JavaPractice;
  
import java.util.*;

public class ConditioalScannerGroup {

	public static void main(String[] args) {
		
		//the example will be a list of stores which are x amount of miles away from
		//your house. using conditional statements we want to see if it is too far or not.
		
		Scanner scan = new Scanner(System.in);
		double walmart, giant;
		
		System.out.println("Enter how far walmart and then giant are from you.");
		
		// walmart = scan.nextDouble();
		giant = scan.nextDouble();
		
		if (giant >=10) {
			System.out.println("giant is too far away! it is " + giant + " miles away");
	
        /System.out.println("Walmart is too far away!  " + walmart + " away");
        
 		}
	}

}
