package day16_string_manipulation;
import java.util.*;
public class Url {

	public static void main(String[] args) {

		//www.amazon.com com, net, edu,org, gov
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url:");
		String url = scan.next();
		
		//assign String domain name and String extension.
		//print them "Domain is:" amazon
		//                      "Extension:" com
		
		//check that it starts with www.
		if(url.startsWith("www")) {
			System.out.println("www. is present");
		}else {//true
		System.out.println("Invalid url format"); 
		return;
		}
		
		//check it contains the ending dot right before the extension
		//find out the length of the url
		//do -4 and using charAt get the character
		//compare if it is '.'
		//www.etsy.com => 12
		
		int dotIndex = url.length() - 4;
		//url.lastIndexOf(".")
		
		if(url.charAt(dotIndex) == '.' ) {
		     System.out.println(" . is there before extension");
		}else {
			System.out.println(" . might be misplaced");
		}
		
		
		/*
		 * if(url.charAt(url.length() - 4) == '.') {
		 * }
		 */
		
		String domain =url.substring(4, dotIndex);
		System.out.println(domain);
		String extension = url.substring(dotIndex+1, url.length());
		System.out.println("Extension: " + extension);
		
		
		
		
	}

}
