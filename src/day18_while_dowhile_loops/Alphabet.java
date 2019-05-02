package day18_while_dowhile_loops;

public class Alphabet {

	public static void main(String[] args) {

		char letter = 'a';

		while (letter <= 'z') {
			System.out.print(letter + " ");
			letter++;
		}

		System.out.println();// new line

		char capitals = 'A';

		while (capitals <= 'Z') {
			System.out.print(capitals + " ");
			capitals++;
		}
		System.out.println();// new line
		char reverse = 'z';
		while (reverse >= 'a') {
			System.out.print(reverse + " ");
			reverse--;
		}
		System.out.println();// new line
		char capitalReverse = 'Z';
		while (capitalReverse >= 'A') {
			System.out.print(capitalReverse + " ");
			capitalReverse--;
		}

		// A
		// AB
		// ABC
		// ABCD
		// ABCDE

		System.out.println();// new line
		String letters = "";
		char myLetter = 'A';

		while (myLetter <= 'Z') {
			letters = letters + myLetter;
			System.out.println(letters);
			myLetter++;

		}

	}

}
