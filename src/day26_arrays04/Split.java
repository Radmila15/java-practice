package day26_arrays04;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {

		String words = "java,kava,html,selenium";
		
		String[] wordsArray = words.split(",");
		
		System.out.println(wordsArray[0]);
		System.out.println(wordsArray[1]);
		System.out.println(wordsArray[2]);
		System.out.println(wordsArray[3]);

		System.out.println("\nCount: "  + wordsArray.length);
		System.out.println(Arrays.toString(wordsArray));
		
		String diceResult = "1 - 20 of 1,461 positions";
		//using split method, print 1,461
		
		String[] diceArray = diceResult.split(" ");
		
		System.out.println("\nSearch result total: "+ diceArray[4]);
		
		String[] diceArray2 = diceResult.split("of"); //or " of " if we do not need spaces => and remove trim
		System.out.println(diceArray2[0].trim());
		System.out.println(diceArray2[1].trim());
		
		
		System.out.println("");
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		
		String[] allWords = sentence.split(" ");
		
		String[] happySplit = sentence.split("happy");
		
		String[] ISplit = sentence.split("I");
		
		
		for(String w : allWords) {
			System.out.println(w);
		}
		System.out.println("AFTER HAPPY SPLIT");

		for(String w : happySplit) {
			System.out.println(w);
		}
		
		
		String word = "java";
		char[] charsArray = word.toCharArray();
		
		for(char ch: charsArray) {
			System.out.println(ch);
		}
		
		
		
	}

}
