package Repl;

import java.util.*;

public class Repl38 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
	    
	    
	   if (number > 0) {
		   System.out.println( number + " is positive");
	   } 
	   if (number < 0) {
		   System.out.println( number + " is negative");
	   }
	   if (number == 0) {
		   System.out.println("it is zero");
	   }
		
	}

}
