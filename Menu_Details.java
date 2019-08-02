package employee;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu_Details {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Login_Details login = new Login_Details();
		Create_employee input = new Create_employee();
		int option;
		System.out.println("1.EMPLOYEE MANAGEMENT 2.FILEHANDLING EMPLOYEE MANAGEMENT");
		System.out.println("Choose the required option");
		option = scan.nextInt();
		switch (option) {
		case 1:
			System.out.println("EMPLOYEE MANAGEMENT");
			Login_Details.login();
		case 2:
			System.out.println("FILEHANDLING EMPLOYEE MANAGEMENT");
			input.dispaly();
		}
	}
}