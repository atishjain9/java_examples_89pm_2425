import java.util.Scanner;

class P019_Grade 
{
	public static void main(String[] args) 
	{
		double avg;

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Average Marks:");
		avg=sc.nextDouble();

		if(avg>=60)
			System.out.println("First Grade...");
		else
			if(avg>=50)
				System.out.println("Second Grade...");
			else
				if(avg>=40)
					System.out.println("Third Grade...");
				else
					System.out.println("No Grade - Failed..");

	}
}
