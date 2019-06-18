package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl115 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
			String[] words = new String[5];
			for(int i = 0; i < 5;  i++) {
			  
			  words[i] = input.nextLine();
			  
			}
			
			System.out.println(words.length);
			
		}

	}

