package day21;

public class ConvertCharToString {

	public static void main(String[] args) {

		//following ways can be used to convert char to String
		char ch = 'a';
		String str1 = ""+ch;
		System.out.println(str1); //1 version
		
		char ch2 = 'v';
		String str2 = new String(""+ch2); //2 version
		
		String str3 = Character.toString(ch2);//3 version
		
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		
	}

}
