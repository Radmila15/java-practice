package day21;
import java.util.*;
public class WoodenSpoon {

	public static void main(String[] args) {
    
		            // 01234
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word");
		String word = scan.next();//java
		String unique = "";
		
		for(int i = 0; i < word.length(); i++) {
			//read the letter and assign
			char letter = word.charAt(i);
			//System.out.println(letter);
			if(!unique.contains(""+letter)) {
				unique += letter;//add to unique
			}				
		}
		
		System.out.println(unique);
		
//		for(int i = 0; i < word.length(); i++) {
//			System.out.print(i); //print i. it increases every loop
//			System.out.println(word.charAt(i));
//		}
		
		
		
		
	}
}