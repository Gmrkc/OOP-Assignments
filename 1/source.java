import java.util.Scanner;

public class source
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter age (18-95) : ");
		int age = scan.nextInt();
		if (age < 18 || age > 95)
		{
			System.out.println("Please enter a valid age !!");
			System.exit(0);
		}
		
		System.out.println("Please enter salary : ");
		int salary = scan.nextInt();
		
		scan.close();
		
		double tax = 0;
		
		if(age >= 18 && age <= 35)
		{
			tax = (0.16 * 17000) + (0.25 * (salary - 17000));
		}
		
		else if (age <= 50)
		{
			tax = (0.16 * 23000) + (0.25 * (salary - 23000));
		}
		
		else if (age <= 74)
		{
			tax = (0.16 * 29000) + (0.25 * (salary - 29000));
		}
		
		else if (age <= 95)
		{
			tax = (0.16 * 14000) + (0.25 * (salary - 14000));
		}
		
		System.out.println("Tax is : "+tax+ " USD");
	}
}
