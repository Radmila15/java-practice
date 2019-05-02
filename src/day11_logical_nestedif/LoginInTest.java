package day11_logical_nestedif;

import java.util.*;

public class LoginInTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username:");
		String username = scan.next();
		
		System.out.println("Enter password");
		String password = scan.next();
		
		String validUserName = "radmila15@gmail.com";
		String validPassword = "CyberTekStudent123";
		
		if (username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
        System.out.println("Login Successful, Welcome!");
		} else if(!username.equalsIgnoreCase(validUserName) && !password.contentEquals(validPassword) ) {	// ! before - is not equals
		System.out.println("Invalid Username and Invalid Password");
		} else if (username.equalsIgnoreCase(validUserName) && !password.contentEquals(validPassword) ) {
			System.out.println("Invalid Password !");
		}else if(!username.equalsIgnoreCase(validUserName) && password.contentEquals(validPassword) ) {
			System.out.println("Invalid Username");
		}
	
			
			
			
			
	}

}
