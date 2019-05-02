package day19_loops_continie;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test:");
                     //0123
		String word = scan.next();
		String reversed = "";
		
		//loop through word in reverse order and
		int idx = word.length()-1;
		while(idx >= 0) {
			reversed  = reversed + word.charAt(idx);
			idx--;

		}
		
		System.out.println(reversed);
		
		if(reversed.equalsIgnoreCase(word)) {
			System.out.println("It is palindrom");
		} else {
			System.out.println("It is not palindrom");
		}
		
		//concetanate each character to reversed string
		
		//compare of word and reversed are equal
		
		
		
		
		
		
		
		
		
		
	}

}
