package Repl;

import java.util.Scanner;

public class Repl83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		

		// your code
		// ------------------------------------------
		//String guestName;
		String name;
		boolean answer;
	
		System.out.println("Please enter guest name:");
	    name = input.next();

		do{
			System.out.println("Do you want to enter new guest name?");
			answer = input.nextBoolean();
			}while (answer == true);
		
			System.out.println("Guest's list: " + name);
		
		}
	}

