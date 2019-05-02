package Repl;

import java.util.*;

public class Repl39 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
	    int answer = number%2;
	    
	    if (answer == 0) {
	    	System.out.println( number + " is even");
	    }
	    else {
	    	System.out.println( number + " is odd");
	    }
	    
	}

}
