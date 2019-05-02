package Repl;
import java.util.*;
public class Repl87 {

	public static void main(String[] args) {
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter word");
	    String word = scan.next();
	    
	    if (word.contains("java")) {
	      word = word.replace("java", "#");
	      if (word.indexOf("#")<=2){
	      exists=true;
	      System.out.println(exists);
	   } else {
	   System.out.println(exists);
	  }
	}
	}
	
	}


