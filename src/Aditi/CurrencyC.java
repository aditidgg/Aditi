package Aditi;
import java.util.Scanner;
public class CurrencyC 
{
 double inr,usd;
 double euro,yen;
 Scanner in = new Scanner(System.in);
 public void dollartorupee() 
 {
   System.out.println("enter dollars to convert into rupees:");
   usd=in.nextInt();
   inr=usd*81.83;
   System.out.println("Dollars="+usd+"equals to rupees="+inr);
   System.out.println("\n");
 }
 public void rupeestodollar()
 {
	System.out.println("enter rupees to convert into dollars:");
	inr=in.nextInt();
	usd=inr/81.83;
	System.out.println("")
 }
}
