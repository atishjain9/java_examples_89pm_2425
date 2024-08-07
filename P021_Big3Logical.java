import java.util.Scanner;

class P021_Big3Logical 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner input=new Scanner(System.in);

		System.out.println("Enter 3 nos:");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();

		String result;

		if(a>b && a>c)
			result="Biggest no is:"+a;
		else
			if(b>c)
				result="Bigges no is:"+b;
			else
				result="Biggest no is:"+c;

		System.out.println(result);
		
	}
}
