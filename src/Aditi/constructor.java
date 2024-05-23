package Aditi;

public class constructor {
	int id;
	String name;
	  constructor()
	{
		System.out.println("This is the default constructor");
		System.out.println("Student ID:\n"+id);
		System.out.println("Student name="+name);
		
	}
   constructor(int i, String n)
   {
	   System.out.println("This is Parametrized Constructor:");
	   id=i;
	   name=n;
	   System.out.println("Student ID:"+id+"\nStudent Name:"+name);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 constructor s = new constructor();
 constructor student= new constructor(10,"ABC");
 
	}
}
