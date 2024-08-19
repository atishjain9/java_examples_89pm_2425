import java.util.Scanner;

class P023_BankingMenu 
{
	public static void main(String[] args) 
	{
		int ch;
		Scanner sc=new Scanner(System.in);

		System.out.println("Banking Main Menu");
		System.out.println("------------------");
		System.out.println("1.Open Account");
		System.out.println("2.Deposit Money");
		System.out.println("3.Withdraw Money");
		System.out.println("4.Account Balance");
		System.out.println("5.Exit");

		System.out.print("Enter ur Choice(1-5):");
		ch=sc.nextInt();

		switch(ch)
		{
			case 1: System.out.println("Account Opening Application Starts..."); break;
			case 2: System.out.println("Deposit Money Application starts..."); break;
			case 3: System.out.println("Withdraw Money Application starts..."); break;
			case 4: System.out.println("Accont Balance Application Starts..."); break;
			case 5: System.exit(0);
			default: System.out.println("Invalid choice...");
		}
	}
}
