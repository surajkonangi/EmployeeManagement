package employee;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu 
{
	ArrayList<String[]> Employee = new ArrayList<String[]>(100);

	public void menu() 
	{
		int options;
		Scanner scan = new Scanner(System.in);
		loop: do
		{
			System.out.println("MENU");
			System.out.println(" 1. Create Employee\n 2. Fetch Employee\n 3. Delete\n 4.search\n 5. Logout");
			System.out.println("Choose the options");
			options = scan.nextInt();
			switch (options)
			{
			case 1:
				Create createEmp = new Create();
				Employee.addAll(createEmp.PersonalDetails());
				break;
			case 2:
				Create fetch = new Fetch(Employee);
				break;
			case 3:
				Delete_Employee delete = new Delete_Employee();
				delete.Delete_Employee(Employee);
				break;
			case 4:
				Search_Employee search = new Search_Employee();
				System.out.println("Search Name or Designation");
				System.out.println(" 1) Name\n 2) Designation\n choose Options");
				int Searchvariable = scan.nextInt();
				switch (Searchvariable) 
				{
				case 1:
					search.search(Employee);
					break;
				case 2:
					System.out.println("Enter the Designation to find the Employee's");
					String Designation = scan.next();
					search.Search(Employee, Designation);
					break;
				}
				break;
			case 5:
				System.out.println("Logout successfully");
				break loop;
			}
		} 
		while (true);
		Login_Details log = new Login_Details();
		log.login();
	}
}
