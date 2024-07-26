
import java.util.Scanner;
class P007_ReadInput
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		
		System.out.print("Enter a no:");
		a=obj.nextInt(); 
		
		System.out.print("Enter another no:");
		b=obj.nextInt();
	
		c=a+b;
		
		System.out.println("The Result is:"+c);
	}
}