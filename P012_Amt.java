import java.util.*;
class P012_Amt 
{
	public static void main(String[] args) 
	{
	  int qty;
	  float rate;
      Scanner sc=new Scanner(System.in);

	  System.out.print("Enter quantity:");
	  qty=sc.nextInt();
	  System.out.print("Enter rate:");
	  rate=sc.nextFloat();

	  float amt=rate*qty;

	  System.out.println("\nQty    Rate     Amt ");
      System.out.println("~~~~~~~~~~~~~~~~~~~~");
      System.out.printf("%d * %f = %f",qty,rate,amt);


	}
}
