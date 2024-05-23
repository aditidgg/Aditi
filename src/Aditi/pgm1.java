package Aditi;
import java.util.Scanner;
public class pgm1 {
String staffid;
String staffname;
long phone;
float salary;
public void accept()
{
	System.out.println("Enter the name of the staff:");
	Scanner scanner= new Scanner(System.in);
	staffname= scanner.nextLine();
	System.out.println("Enter the ID of the staff:");
	staffid= scanner.nextLine();
	System.out.println("Enter the phone number of the staff:");
	phone=scanner.nextLong();
	System.out.println("Enter the salary:");
	salary=scanner.nextFloat();
	System.out.println("\n");
}
public void display()
{
	System.out.println("The details of the staff are:");
	System.out.println("Staff name:"+staffname);
	System.out.println("Staff Id:"+staffid);
	System.out.println("Staff phone number:"+phone);
	System.out.println("Staff salary:"+salary);
	System.out.println("\n");
}
public class teaching extends pgm1
{
	String domain;
	int publications;
	public void accept()
	{
		super.accept();
		System.out.println("The domain of teaching of the staff is:");
		Scanner scanner= new Scanner(System.in);
		domain=scanner.nextLine();
		System.out.println("The numer of publications of the staff is/are:");
		publications= scanner.nextInt();
		System.out.println("\n");
	}
	public void display()
	{
		super.display();
		System.out.println("The teaching details include:");
		System.out.println("\n");
		System.out.println("Domain:"+domain);
		System.out.println("\n");
		System.out.println("Total number of publications:"+publications);
		System.out.println("\n");
	}
}
public class technical extends pgm1
{
	String skill;
	public void accept()
	{
		super.accept();
		System.out.println("Enter the technical skill of the staff:");
		Scanner scanner= new Scanner(System.in);
		skill= scanner.nextLine();
		System.out.println("\n");
	}
	public void display()
	{
		super.display();
		System.out.println("The technical skill of the staff:"+skill);
		System.out.println("\n");
	}
}
class info
{
public static void main(String[] args)
{
	
}
	
}
}
