import java.util.Scanner;

class P008_ReadStudentData 
{
	public static void main(String[] args) 
	{
		int rollno;
		String name,gender;
		float height;
		double fees;

		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Rollno:");
		rollno=obj.nextInt();
		
		System.out.print("Enter ur Name:");
		obj.nextLine(); //cleaning the buffer
		name=obj.nextLine();

		System.out.print("Enter ur Gender:");
		gender=obj.next();

		System.out.print("Enter ur Height:");
		height=obj.nextFloat();

		System.out.print("Enter ur Course Fees:");
		fees=obj.nextDouble();

		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Height:"+height);
		System.out.println("Course Fees:"+fees);






		
	}
}
