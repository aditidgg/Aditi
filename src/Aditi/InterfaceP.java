package Aditi;
 interface Resume
 {
	 void biodata();
 }
 class Teacher implements Resume
 {
	 String name, quali,achi;
	 float exper;
	 public void biodata()
	 {
		 name="Ankitha";
		 quali="BE";
		 achi="sksks";
		 exper=22.22f;
		 System.out.println("Teacher Resume");
		 System.out.println("Name"+name);
		 System.out.println("Qualifications="+quali);
		 System.out.println("Achievments="+achi);
		 System.out.println("Experience="+exper); 
	 }
 }
 class student implements Resume
 {
	 String name, dis;
	 float result;
	 public void biodata()
	 { 
		 name="Aditi";
		 result=9.8f;
		 dis="CSE";
		 System.out.println("Student Resume");
		 System.out.println("Name"+name);
		 System.out.println("Result"+result+"cgpa");
		 System.out.println("Discpline"+dis);
	 }
 
 }
 
public class InterfaceP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Teacher obj1= new Teacher();
  obj1.biodata();
  student obj2= new student();
  obj2.biodata();
	}
}
