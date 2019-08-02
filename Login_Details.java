package employee;
import java.util.*;
public class Login_Details
{
	static String user_name = "suraj";
	static String pass_word = "123";
	static String user_name1;
	static String password1;
	public static void login() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter username");
		user_name1 = scan.nextLine();
		System.out.println("enter password");
		password1 = scan.nextLine();
	}
	public static void verify() throws Exception
		{
		System.out.println(user_name1);
		if (user_name1.equals(user_name) && password1.equals(pass_word)) 
		{
		System.out.println("loggined successfully");
		Menu emp = new Menu();
		emp.menu();
		}
		else
		{
			System.out.println("Username or password is Incorrect type valid username or password");
			login();
		}
		}
}
