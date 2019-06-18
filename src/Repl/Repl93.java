package Repl;

import java.util.Scanner;

public class Repl93 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.next(); //abXYabc
	    int n = scan.nextInt(); //1 or 2 or 3

	    boolean result = false;
	    if (n < str.length() && (str.substring(1)).indexOf(str.substring(0,n)) > -1) {
	    	result = true;
	         System.out.println(result);
	    }else {
	      System.out.println(false);
	    }
	}

}
