package Repl;

import java.util.Scanner;

public class Repl45 {

	public static void main(String[] args) {

		int player, house;
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter player score: ");
		  player = scan.nextInt();
		  System.out.println("Enter house: ");
		  house = scan.nextInt();
		    if (player >= 21) {
		      System.out.println("bust");
		    } else if (house > player) {
		      System.out.println("player loss");
		    } else if (player == house) {
		      System.out.println("its a tie");
		    } else if (player > house) {
		      System.out.println("player wins");
		    }
		    
	}
}