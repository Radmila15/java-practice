package Repl;
import java.util.*;
public class Repl34 {

	public static void main(String[] args) {

		int candies, gumballs;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of coupons:");
		
		int coupons = scan.nextInt();
		
		//10 coupons == 1 candies 
		//10 coupons == 3 gumballs
	
		if (coupons >= 3) {
			candies = coupons/10;
			coupons = coupons%10;
			gumballs = coupons/3;
		System.out.println("Number of Candies: " + candies);
		System.out.println("Number of Gumballs: " + gumballs);
		} else if (coupons < 13) {
			System.out.println("Not enough coupons");
		}
		
	}

}
