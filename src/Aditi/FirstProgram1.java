package Aditi;
import java.util.Scanner;
public class FirstProgram1 {

	public static void main(String[] args) {
		String name,usn,address,dept;
		Long phno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student's name:");
		name=sc.next();
		System.out.println("Enter the student's USN:");
		usn=sc.next();
		System.out.println("Enter the address of the student:");
		address=sc.next();
		System.out.println("Enter the department");
		dept=sc.next();
		System.out.println("Enter the phone number:");
		phno=sc.nextLong();
		System.out.println("The details are:"+name+" "+usn+" "+address+" "+" "+dept+" "+phno);
	}

}
