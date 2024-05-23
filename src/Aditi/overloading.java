package Aditi;
 class overload 
{
  int add(int a, int b)
  {
	int sum=a+b;
	return sum;
  }
  int add(int a, int b, int c)
  {
	  int sum=a+b+c;
	  return sum;
  }
  float add(float a, float b)
  {
	  float sum=a+b;
	  return sum;
  }
}
class overloading
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   overload obj= new overload();
   int s1= obj.add(10,20);
   int s2= obj.add(10,20,30);
   float s3=obj.add(2.1f,2.2f);
   System.out.println("Method overloading sum1="+s1);
   System.out.println("Method overloading sum2="+s2);
   System.out.println("Method overloading sum3="+s3);
}
	
}

