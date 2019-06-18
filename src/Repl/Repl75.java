package Repl;

import java.util.*;

public class Repl75 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String newWord1, newWord2;
		char first = word.charAt(0);
		char last = (word.charAt(word.length() - 1));

//		if (((first == 'x') || (first == 'X')) || ((last == 'X') || (last == 'x'))) {
//			newWord1 = word.substring(1, word.length() - 1);
//			// newWord2=word.substring(word.length(),word.length()-1);
//			System.out.println(newWord1);
//			// System.out.println(newWord2);
//		} else {
//			System.out.println(word);
//		}
		if ((first == 'x') || (first == 'X')) {
			word = word.substring(1);
		}
		if ((last == 'X') || (last == 'x')) {
			word = word.substring(0, word.length() - 1);
		}
		System.out.println(word);

	}

}
