class P027_TableNo 
{
	public static void main(String[] args) 
	{
		int tno=5;
		int c,res=0;

		for(c=1;c<=12;c++)
		{
			res=tno*c;
			System.out.printf("\n%d * %d = %d",tno,c,res);
		}
	}
}
