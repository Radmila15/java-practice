package Repl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repl105_arrays {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//	   // String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
//		String str ="";
//	    String[] words = {"hello", "why", "by", "apple" , "note"};
//	   
//	   
//
//	    //TODO: Write your code below
//	    for (String word: words) {
//	    	//System.out.print(Character.toString(word.charAt(0)));
//	    	//System.out.print(Character.toString(word.charAt(word.length()-1)));
//	    	str= str+Character.toString(word.charAt(0))+Character.toString(word.charAt(word.length()-1))+", ";
//	    //System.out.println((Character.toString(word.charAt(0)) + Character.toString(word.charAt(word.length()-1))));
//	      //System.out.print(word.indexOf(0) + word.indexOf(word.length()-1));
//	    }
//	    
//	    System.out.println("["+str.substring(0,str.length()-2)+"]");
//	  }
		// }

//		
//		System.out.println("");
//		while (!ddd.isEmpty()) {
//			for(int index: ddd ) {
//				left = index;
//				rithg = index;
//				
//				
//				if(index != 0 ) {
//					left = index-1;
//				}
//				if(index != inhabitants.length-1) {
//					rithg = index+1;
//				}
//				
//				inhabitants[left] =  inhabitants[left]/2;
//				inhabitants[rithg] =  inhabitants[rithg]/2;
//				
//				if(left != index ) {
//					if(inhabitants[left] == 0) {
//						ddd.add(left);
//					}
//				}
//				if(rithg != index) {
//				if(inhabitants[rithg] == 0) {
//					ddd.add(rithg);
//				}
//				}
//				
//			}
//			for (int i = 0; i < inhabitants.length; i++) {
//				System.out.print(inhabitants[i]);
//			}
//			System.out.println();
//			
//		}
//	    for(int i=0; i<inhabitants.length; i++) {
//	      inhabitants[i] = input.nextInt();
//	    }
		Scanner input = new Scanner(System.in);
		int[] inhabitants = { 3, 0, 0, 5, 0, 0, 2, 7, 0 };
		boolean endLoop = true;
		int status = 0;

		while (endLoop) {
			for (int i = 0; i < inhabitants.length; i++) {
				
				if (inhabitants[i] == 0) {
					
					if (i == 0 || i == inhabitants.length) {
						continue;
					}
					status = 1;
					inhabitants[i - 1] = inhabitants[i - 1] / 2;

				}

//				if (status == 1) {
//					inhabitants[i - 1] = inhabitants[i - 1] / 2;
//					status = 2;
//				}
//
//				if ((status == 2) && (inhabitants[i] == 0)) {
//					status = 3;
//					continue;
//				}
//				if (status == 3) {
//					status = 3;
//					continue;
//				}
//
//				if (inhabitants[i] == 0) {
//					status = 1;
//					if (i == 0) {
//						continue;
//					}
//					inhabitants[i - 1] = inhabitants[i - 1] / 2;
//
//				}
//				if() {
//					inhabitants[i] = inhabitants[i] / 2;
//					flag = false;
//				}
//				if(inhabitants[i] == 0) {
//					flag = true;
//					if(i == 0) {continue;}
//					inhabitants[i - 1] = inhabitants[i - 1] / 2;
//					
//				}

				// System.out.print(inhabitants[i]);

			}
			break;
		}

//		while (flag) {
//			flag = false;
//			for (int i = 0; i < inhabitants.length; i++) {
//				System.out.print(inhabitants[i]);
//
//			}
//			System.out.println();
//
//			for (int i = 0; i < inhabitants.length; i++) {
//				if (inhabitants[i] == 0) {
//
//					if (i != 0) {
//						if (inhabitants[i - 1] != 0) {
//							inhabitants[i - 1] = inhabitants[i - 1] / 2;
//							flag = true;
//						}
//					}
//
//					if (i != inhabitants.length - 1) {
//						if (flag2 == true) {
//							flag2 = false;
//							continue;
//						}
//						if (inhabitants[i + 1] != 0) {
//							inhabitants[i + 1] = inhabitants[i + 1] / 2;
//							flag = true;
//							if (inhabitants[i + 1] == 0) {
//								flag2 = true;
//							}
//						}
//					}
//
//				}
//			}
//
//			
//		}

	}
}
