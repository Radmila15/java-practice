package day23_arrays;
import java.util.*;
public class WarmUpTask {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int number = scan.nextInt();
		
		for (int i = 2; i < number; i++) {
			if (number%i == 0) {
				System.out.println("this is not a prime number");
				return;
			}
		}
		

		
		
		
		
	}

}
