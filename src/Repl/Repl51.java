package Repl;

import java.util.*;

public class Repl51 {

	public static void main(String[] args) {

		String split123, quality;
		int people;
		double amount, totalTip,totalPay, totalPerPerson, tipPerPerson;
		System.out.println("Split:");
		Scanner scan = new Scanner(System.in);
		split123 = scan.next();

		System.out.println("Number of people:");
		people = scan.nextInt();

		System.out.println("Check amount:");
		amount = scan.nextDouble();

		System.out.println("Service Quality:");
		quality = scan.next();

		if (split123.equalsIgnoreCase("yes")) {
			System.out.print("Number of people entered: ");
			switch (people) {
			case 1:
				System.out.println("&");
				break;
			case 2:
				System.out.println("&&");
				break;
			case 3:
				System.out.println("&&&");
				break;
			case 4:
				System.out.println("&&&&");
				break;
			case 5:
			  System.out.println("&&&&&");
			}
		}

		switch (quality) {
		case "Poor":
			totalTip = amount * 0.05;
			break;
		case "Fair":
			totalTip = amount * 0.1;
			break;
		case "Good":
			totalTip = amount * 0.15;
			break;
		case "Great":
			totalTip = amount * 0.2;
			break;
		case "Excellent":
			totalTip = amount * 0.25;
			break;
		default:
			totalTip = 0;
		}
		totalPay= totalTip + amount;
		System.out.println("Total to pay: " + totalPay);
		
		System.out.println("Total tip: " + totalTip);
		
		totalPerPerson = totalPay / people;
		System.out.println("Total per person: " + totalPerPerson);
		
		tipPerPerson = totalTip/ people;
		System.out.println("Tip per person: " + tipPerPerson);
		
		
  }
}