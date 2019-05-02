package my_draft;
import java.util.*;
public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int numberOfPeople;
		String serviceQuality;
		String split;
		double totalToPay = 0.0, totalTip = 0.0, totalPerPerson = 0.0, tipPerPerson = 0.0, checkAmount;
		System.out.println("Enter number of people:");
		numberOfPeople = keyboard.nextInt();
		if (numberOfPeople > 10) {
			System.out.println("we can only split the bill by 10 people");
			numberOfPeople = 10;
		} else if (numberOfPeople >= 1 && numberOfPeople <= 10) {
			numberOfPeople = numberOfPeople;
		} else if (numberOfPeople == 0) {
			numberOfPeople = 1;
		} else {
			while (true) {
				if (numberOfPeople < 0) {
					System.out.println("Number of people dining cannot be less than 0! " + "Re-enter number of people");
					numberOfPeople = keyboard.nextInt();
				}
				if (numberOfPeople > 0) {
					break;
				}
			}
		}
		System.out.println("Would you like to split the bill or not? To split the bill, enter \"split\", "
				+ "to not split the bill, enter \"not split\"");
		keyboard.nextLine();
		split = keyboard.nextLine();
		while (true) {

			if (!split.equalsIgnoreCase("split") && !split.equalsIgnoreCase("not split")) {
				System.out.println("invalid response! To split the bill, enter \"split\", to not split the bill, "
						+ "enter \"not split\"");
				split = keyboard.nextLine().toLowerCase();
			}
			if (split.equalsIgnoreCase("split") || split.equalsIgnoreCase("not split")) {
				break;
			}

		}

		System.out.println("Enter bill total");
		checkAmount = keyboard.nextDouble();
		if (checkAmount <= 0) {
			System.out.println("Go HOME!");
			return;
		}

		System.out.println("How was the service tonight? Enter Poor, Fair, Good, Great, or Excellent!");
		serviceQuality = keyboard.next().toLowerCase();
		while (true) {
			if (!serviceQuality.equalsIgnoreCase("poor") && !serviceQuality.equalsIgnoreCase("fair")
					&& !serviceQuality.equalsIgnoreCase("good") && !serviceQuality.equalsIgnoreCase("great")
					&& !serviceQuality.equalsIgnoreCase("excellent")) {
				System.out.println("Invalid service quality! Enter Poor, Fair, Good, Great, or Excellent!");
				serviceQuality = keyboard.next().toLowerCase();
			}
			if (serviceQuality.equalsIgnoreCase("poor") || serviceQuality.equalsIgnoreCase("fair")
					|| serviceQuality.equalsIgnoreCase("good") || serviceQuality.equalsIgnoreCase("great")
					|| serviceQuality.equalsIgnoreCase("excellent")) {
				break;
			}

		}

		switch (serviceQuality) {
		case "poor":
			System.out.println(split);
			System.out.print("Number of people: ");
			for (int i = 0; i < numberOfPeople; i++) {
				System.out.print("&");
			}
			System.out.println();
			totalTip = checkAmount * .05;
			totalToPay = checkAmount + totalTip;
			totalPerPerson = totalToPay / numberOfPeople;
			tipPerPerson = totalTip / numberOfPeople;
			break;

		case "fair":
			System.out.println(split);
			System.out.print("Number of people: ");
			for (int i = 0; i < numberOfPeople; i++) {
				System.out.print("&");
			}
			System.out.println();
			totalTip = checkAmount * .10;
			totalToPay = checkAmount + totalTip;
			totalPerPerson = totalToPay / numberOfPeople;
			tipPerPerson = totalTip / numberOfPeople;
			break;

		case "good":
			System.out.println(split);
			System.out.print("Number of people: ");
			for (int i = 0; i < numberOfPeople; i++) {
				System.out.print("&");
			}
			System.out.println();
			totalTip = checkAmount * .15;
			totalToPay = checkAmount + totalTip;
			totalPerPerson = totalToPay / numberOfPeople;
			tipPerPerson = totalTip / numberOfPeople;
			break;

		case "great":
			System.out.println(split);
			System.out.print("Number of people: ");
			for (int i = 0; i < numberOfPeople; i++) {
				System.out.print("&");
			}
			System.out.println();
			totalTip = checkAmount * .20;
			totalToPay = checkAmount + totalTip;
			totalPerPerson = totalToPay / numberOfPeople;
			tipPerPerson = totalTip / numberOfPeople;
			break;

		case "excellent":
			System.out.println(split);
			System.out.print("Number of people: ");
			for (int i = 0; i < numberOfPeople; i++) {
				System.out.print("&");
			}
			System.out.println();
			totalTip = checkAmount * .25;
			totalToPay = checkAmount + totalTip;
			totalPerPerson = totalToPay / numberOfPeople;
			tipPerPerson = totalTip / numberOfPeople;
			break;

		}
		System.out.println("Total to pay: $" + totalToPay);
		System.out.println("Total tip: $" + totalTip);
		System.out.println("Total per person: $" + totalPerPerson);
		System.out.println("Tip per person: $" + tipPerPerson);



	}

}
