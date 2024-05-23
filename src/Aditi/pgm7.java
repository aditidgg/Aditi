package Aditi;
import java.util.*;
public class pgm7 
{
	int c;
    void div(int a, int b)
    {
    try 
    {
    	c=a/b;
    	System.out.println("Result="+c);
    }
    catch(ArithmeticException e)
    {
    	System.out.println("Cannot divide by zero");
    }
    }
 public static void main(String args[])
 {
	pgm7 obj= new pgm7();
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the values of a and b   \n");
	int no1=in.nextInt();
	int no2=in.nextInt();
	obj.div(no1, no2);
 }
}
