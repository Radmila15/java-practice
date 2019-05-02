package my_draft;

public class UniqueCharacters {

	public static void main(String[] args) {

		
		String word = "osetia is in my heart";
		String unique = "";
		
		char ch = word.charAt(0);
		
		System.out.println(unique.contains("" + ch));
		
		if (!unique.contains("" + ch)) {
			unique = unique + ch;
		}
		System.out.println("Unique: " + unique);
		
		
	}

}
