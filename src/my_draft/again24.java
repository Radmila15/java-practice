package my_draft;

import java.util.*;

public class again24 {

	public static void main(String[] args) {

		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int age, zipcode;
		double height, weight;
		boolean isMarried;
		long workPhoneNumber, personalPhoneNumber;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");
		
		System.out.println("Enter your firstName");
		firstName = scan.next();
		
		System.out.println("Enter your lastName");
		lastName = scan.next();
		
        System.out.println("Enter your email");
		email = scan.next();
		
		System.out.println("Enter your street");
		street = scan.next();
		street +=scan.nextLine();

		System.out.println("Enter your city");
		city = scan.next();
		
		System.out.println("Patient personal information");
		System.out.println("Full name: " + lastName + ", " + firstName);
		
		
		
		
		city = scan.next();
		
		System.out.println("Enter your state");
		
		System.out.println("Enter your zipcode");

	}

}
