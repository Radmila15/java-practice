package Repl;

import java.util.Scanner;

public class Repl73 {

	public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);
		  String email = scan.next();
		    String firstName = "", lastName = "", domain = "", topLevelDomain = "";
		    
		    int end = email.indexOf('_');
		    firstName = email.substring(0,end);
		    String s1 = firstName.substring (0,1).toUpperCase()+firstName.substring(1);
		    lastName = email.substring(end+1, email.indexOf('@'));
		    String s2 = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
		    
		    int dotIndex = email.indexOf('.') + 1;
		    
		    String extension = email.substring(dotIndex, email.length());
		    System.out.println("First name: " + s1);
		    System.out.println("Last name: " + s1);
		    System.out.println("Domain: " + email.substring(email.indexOf('@')+1, email.indexOf('.')));
		    System.out.println("Top-Level Domain: " + extension);
	}

}
