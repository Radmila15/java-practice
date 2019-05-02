package day19_loops_continie;

public class PrintLettters {

	public static void main(String[] args) {

		String word = "Amazon";
		             //012345 => indexes
		             //123456 => length 
		
		//print each character one by one in separate lines //charAt //indexOf //length
		int idx = 0;
		//System.out.println(word.charAt(idx)); //A
		//idx++;
		//System.out.println(word.charAt(idx)); //m
		//idx++;
		//System.out.println(word.charAt(idx));//a
		//idx++;
		//System.out.println(word.charAt(idx));//z
		//idx++;
		//System.out.println(word.charAt(idx));//o
		//idx++;
		//System.out.println(word.charAt(idx));//n
		
		                //6
		while(idx < word.length()) {
		System.out.println(word.charAt(idx));
		idx++;
	}
		
		//print each character in reverse order
		int idx2 = word.length()-1; //5
		while(idx2 >=0) {
			System.out.println(word.charAt(idx2));
			idx2--;
		}
		
	}

}


