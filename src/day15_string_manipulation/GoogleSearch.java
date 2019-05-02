package day15_string_manipulation;

public class GoogleSearch {

	public static void main(String[] args) {

		String item = "java";
		String pageTitle = item + " - Google search";
		
		//test if pageTitle starts with item
		if(pageTitle.startsWith("java")) {
			System.out.println("PASS: Page title check passed");
		}else {
			System.out.println("FAIL: Page title check failed");
		}
		
		if(pageTitle.endsWith("Google Search")) {
			System.out.println("PASS: Google search is in title");
		}else {
			System.out.println("FAIL: Google search is not in title");
		}
		
		
		
	}

}
