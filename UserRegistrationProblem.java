import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration
{
	public static void main(String[] args)
	{
		System.out.println("WELCOME TO USER REGISTRATION PAGE");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstname = sc.nextLine();
		System.out.println("Enter last name: ");
		String lastname = sc.nextLine();
		System.out.println("Enter e-mail address: ");
		String email = sc.nextLine();
		System.out.println("Enter mobile number: ");
		String phno = sc.nextLine();
		System.out.println("Enter password: ");
		String pswd = sc.nextLine();
		validateFirstName(firstname);
		validateLastName(lastname);
		validateEmail(email);
		validateMobileNumber(phno);
		validatePassword(pswd);
	}
	static void validateFirstName(String firstname)
	{
		String regexPattern = "^[A-Z][a-z]{2,}$";
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(firstname);
		if(m.matches())
			System.out.println("Valid first name");
		else
			System.out.println("Invalid first name");
	}
	static void validateLastName(String lastname)
	{
		String regexPattern = "^[A-Z][a-z]{2,}$";
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(lastname);
		if(m.matches())
			System.out.println("Valid last name");
		else
			System.out.println("Invalid last name");
	}
	static void validateEmail(String email)
	{
		String regexPattern = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(email);
		if(m.matches())
			System.out.println("Valid e-mail address");
		else
			System.out.println("Invalid e-mail address");
	}
	static void validateMobileNumber(String phno)
	{
		String regexPattern = "^(91){1}[ ][6-9]{1}[0-9]{9,9}$";
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(phno);
		if(m.matches())
			System.out.println("Valid mobile number");
		else
			System.out.println("Invalid mobile number");
	}
	static void validatePassword(String pswd)
	{
		String regexPattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(pswd);
		if(m.matches())
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");
	}
}
