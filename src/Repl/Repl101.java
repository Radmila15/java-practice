package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl101 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    String word2;

	    //TODO: Write your code below
	   // for ( String i = 0; i <= words; i++) {
	    word2= (Arrays.deepToString(words));
	      System.out.println(startsWith(word2)+ endsWith(word2));
	   // }
	}

}
