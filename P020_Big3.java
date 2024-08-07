import java.util.Scanner;

class P020_Big3 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner input=new Scanner(System.in);

		System.out.println("Enter 3 nos:");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();

		if(a>b)
			if(a>c)
				System.out.println("Biggest no is:"+a);
			else
				System.out.println("Biggest no is:"+c);
		else
			if(b>c)
				System.out.println("Bigges no is:"+b);
			else
				System.out.println("Biggest no is:"+c);





		
	}
}
