import java.util.Scanner;
class P028_DigitsCount 
{
	public static void main(String[] args) 
	{
		int no,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no:");
		no=sc.nextInt();

	
	   while(no!=0) 
		{
         no=no/10;  
		 count++; 
		}

		System.out.println("No of Digits are:"+count);

		
	}
}
