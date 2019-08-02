package employee;
import java.util.ArrayList;
import java.util.Scanner;
public class Delete_Employee
{
Scanner sc=new Scanner(System.in); 
public ArrayList<String[]> Delete_Employee(ArrayList<String[]> employe) 
{
if(employe.isEmpty())
{
System.out.println("Employee database is empty");
return null; 
}
else 
{
System.out.println("Enter the Employee id to find the Employee");
int Emp_id=sc.nextInt();
for(int initial1=0; initial1<employe.size(); initial1++)
{
String[] TempEmp=employe.get(initial1);
///check the employee id equals to user input id  
if(TempEmp[0].equals(Integer.toString(Emp_id)))
{
System.out.println("Successfully Deleted Employee_id"+TempEmp[0]);
employe.remove(initial1);
}
}
return employe;
}
}
}
