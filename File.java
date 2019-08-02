package employee;


	import java.util.*;
	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.InputStream;

	public class File {
	public static void main(String[] args) throws Exception {
	Scanner scan = new Scanner(System.in);

	System.out.println("enter how many employees details has to be created");
	int size = scan.nextInt();
	int[] a = new int[size];
	InputStream in = System.in;
	for (int i = 0; i < a.length; i++) {
	System.out.println("create Employee details of:" + (i + 1));
	System.out.println("enter the name");
	scan.nextLine();
	String name = scan.nextLine();
	System.out.println("enter the gender");
	String gender = scan.next();
	System.out.println("enter the age");
	String age = scan.next();
	System.out.println("enter the phonenbr");
	String phonenbr = scan.next();
	System.out.println("enter the id ");
	String id = scan.next();
	System.out.println("enter the joiningDate ");
	String joiningDate = scan.next();
	System.out.println("enter the experience ");
	String experience = scan.next();
	System.out.println("enter the skills");
	String skills = scan.next();

	BufferedWriter bw = new BufferedWriter(new FileWriter(
	"C:\\Users\\Suraj.konangi\\git\\Assignment\\Trainning\\src\\employee\\Create",true));
	String s = "\n" + name + " " + gender + " " + age + " " + phonenbr + " " + id + " " + joiningDate + " "
	+ experience + " " + skills + " \n";
	bw.write(s);
	bw.flush();


	}
	}
	}

