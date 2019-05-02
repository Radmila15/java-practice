package Repl;

import java.util.Scanner;

public class Repl86 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = scan.next();
	    
	    word = word.replace ("cat", "#");
	  word = word.replace ("dog", "!");
	    
	    for (int i=0; i < word.length(); i++) {
	      if(word.charAt(i)=='#')
	      countOfCats++;
	      
	      else if (word.charAt(i) == '!')
	      countOfDogs++;
	    }
	    System.out.println(countOfCats == countOfDogs);
	  }
	}