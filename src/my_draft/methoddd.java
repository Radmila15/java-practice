package my_draft;

import java.util.Scanner;

class methoddd {
	public static void main(String args[]) {
	     methoddd.isOdd();
	}
	      int number;
	      System.out.println("Enter an integer to check if it is odd or even: ");
	      Scanner input = new Scanner(System.in);
	      number = input.nextInt();
	      
	      
	 }
	   public static boolean isOdd(int number)
	   { 
	    if(number % 2 == 0)
	   {
	        return true;
	    }
	    return false;

	}

	      boolean answer=isOdd(number);
	      if (answer=true)
	      {
	          System.out.println("EVEN");
	      }

	      if (answer=false)
	      {
	          System.out.println("ODD");
	      }



	  

	
		  }
		  
		
		