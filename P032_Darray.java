class P032_Darray 
{
	public static void main(String[] args) 
	{
		int arr[][]=new int[3][3];
		int r,c;

		for(r=0;r<arr.length;r++)
		{
			for(c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	}
}
