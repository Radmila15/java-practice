package Repl;

import java.util.Scanner;

public class Repl83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// your code
		// ------------------------------------------
		// String guestName;
		String name, answer, guestName;

		System.out.println("Please enter guest name:");
		name = input.next();
		System.out.println("Do you want to enter new guest name?");
		answer = input.next();
		while (answer.equals("yes")) {
			System.out.println("Please enter guest name:");
			guestName = input.next();
			name +=", " + guestName;
			System.out.println("Do you want to enter new guest name?");
			answer = input.next();
		}

		System.out.println("Guest's list: " + name );

	}
}
