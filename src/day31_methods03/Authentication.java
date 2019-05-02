package day31_methods03;

public class Authentication {
	public static void main(String[] args) {
		login("mentoring@cybertekschool.com", "mentor001"); //Login succesfull
		login("entoring@cybertekschool.com", "mentor001"); //failed
	}
	/*
	 * Name: Login
	 * Return type: void 2 String args/params: username, password Inside
	 * the method: validUsername = "mentoring@cybertekschool.com" validPassword =
	 * "mentor001"
	 * 
	 * if username and password match, print "login Succesfull! Welcome to Okta" if
	 * not: "Sign in failed!"
	 */

	public static void login(String userName, String password) {
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "mentor001";

		if (userName.equals(validUsername) && password.contentEquals(validPassword)) {
			System.out.println("Login Succesfull! Welcome to Okta!");
		} else {
			System.out.println("Sign in failed!");
		}
	}
}
