package day16_string_manipulation;

public class Concat {

	public static void main(String[] args) {

		String word = "java";
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));

		System.out.println(word);

		word = word.concat("+Eclipse");
		System.out.println(word);

		word = word.concat("   Automtion");
		System.out.println(word);

		word = word + "-Cucumber";
		System.out.println(word);

		// word = word.concat(123); will not work
		word = word + 123;
		System.out.println(word);

	}

}
