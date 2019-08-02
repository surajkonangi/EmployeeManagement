package employee;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Fetch_employee {
	String userword;

	public static void main(String[] args) throws IOException {
		Scanner sc1 = new Scanner(System.in);
		FileReader file = new FileReader(
				"C:\\Users\\Suraj.konangi\\git\\Assignment\\Tranning\\src\\employee\\storage.txt");
		Scanner sc = new Scanner(file);
		System.out.println("enter the name");
		String EmpName = sc1.next();
		while (sc.hasNextLine()) {
			String[] str = sc.nextLine().split(",");
			if (str[0].equals(EmpName)) {

				for (String a : str) {

					System.out.println(a);
				}
			}
		}
	}
}
