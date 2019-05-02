package day21;
import java.util.*;
public class Register {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome, Radmila!");
		System.out.println("How many cities are you going to visit this month?");
		int total = scan.nextInt();
		
		double moneyForTrip = 0.0;
		String cities = "";
		
		for(int count = 1; count <= total; count++) {
			System.out.println("Which city will be " + count + "?");
			String cityName = scan.next();
			System.out.println("How much money do you need?");
			double money = scan.nextDouble();
			System.out.println("How much money do you have?");
			
			cities += cityName + ", ";
			moneyForTrip += money;
		}
		
		System.out.println("Your are going to visit " + total + "cities");
		System.out.println("You need: $" + moneyForTrip);		
		
		
		
		
		
		
		
		
		
		
	}

}
