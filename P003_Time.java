class P003_Time
{
	public static void main(String args[])
	{
		int totaltime=130;
		int h,m;
		
		h=totaltime/60;
		m=totaltime%60;
		
		System.out.println("Time is "+h+" hrs and "+m+" mins...");
		System.out.printf("Time is %d hrs and %d mins...",h,m);
		
		
	}
}