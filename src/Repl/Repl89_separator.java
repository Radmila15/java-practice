package Repl;
import java.util.*;
public class Repl89_separator {

	public static void main(String[] args) {
		
	    
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    String sentence = "";
	    int count = scan.nextInt();
	    
	    for (int i = 0; i < count; i++) {
	      sentence += word + separator;
	    }
	    System.out.print(sentence);

	    System.out.println(sentence.substring(0,sentence.length()-1));
	   // sentence.length()-1;
	}

}
