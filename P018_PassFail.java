//Write a java program to check whether the person is Passed or Failed
//based on average marks

class P018_PassFail 
{
	public static void main(String[] args) 
	{
		double avg=29;
		String msg1,msg2;

		if(avg>=40)
		{
			msg1="Passed";
			msg2="Congrats..";
			
		}
		else
		{
			msg1="Failed...";
		    msg2="Better Luck Next Time...";
		}
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("Thank You!");
	}
}
