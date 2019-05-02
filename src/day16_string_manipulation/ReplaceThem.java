package day16_string_manipulation;

public class ReplaceThem {

	public static void main(String[] args) {
		
		String sentence = "Coding is fun, it is my hobby!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		
		System.out.println(sentence);
		//replace, with!!!
		sentence = sentence.replace("," , "!!!");
		System.out.println(sentence);
		
		String mixed = "&^@#j$a-v|a@#$";
		//clean up mixed
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed); // j$a-v|a
		
		mixed = mixed.replace("$", "");
		mixed = mixed.replace("-", "");
		mixed = mixed.replace("|", "");
		
		//or mixed=mixed.replace("$", "").replace("-", "").replace("|", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("a", "");
		System.out.println(mixed);
		
		String result = "About 24,000,000 results (0.68 seconds)";
        // using replace, get number of results
		//24,000,000
		
		result = result.replace(" ", "");
		System.out.println(result);
		
		result = result.replace("e", "u");
		System.out.println(result);
		
		result = result.replace("About", "");
		System.out.println(result);
		
		//result = result.replace("", " ");
		//System.out.println(result);
		
		//result = result.replace("u", "e");
		//System.out.println(result);
		
		result = result.substring(0, result.indexOf(" "));
		System.out.println(result);
		
		result = result.replace(",", "");
		System.out.println(result);

	}

}
