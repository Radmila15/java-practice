package Repl;

import java.util.*;

public class Repl31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of milligrams in drink:");
		
		int milligrams = scan.nextInt();
		
		double grams =0;

		grams = milligrams/1000;
		
	if (grams >= 10) {
    System.out.println("It would take about " + drinks + " drinks" + "for a lethal overdose." );
	}

}
}