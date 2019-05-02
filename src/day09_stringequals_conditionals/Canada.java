package day09_stringequals_conditionals;

import java.util.Scanner;

public class Canada {

	public static void main(String[] args) {
        
		//String capital; OLD
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("What is the capital of Canada?");
		
		//capital = scan.nextLine(); OLD
		String capital = scan.nextLine(); //NEW
		
		if (capital.equals("Ottawa") ) {//REEEEEEMEMBER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			//(capital.equalsIgnoreCase("Ottawa") ) // IGNORE
			System.out.println("Your answer is correct!");
		} else {
			System.out.println("Your answer is incorrect! " + capital + " value is not capital of Canada");
		}
		
	}

}
