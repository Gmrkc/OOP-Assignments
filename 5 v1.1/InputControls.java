import java.util.*;

public class InputControls
{
	static Scanner input = new Scanner(System.in);
	
	public static double doubleAmountControl()
	{
		double var = 0;
		
		while(true)
		{
			try
			{
				var = input.nextDouble();
				break;
			}
			catch(Exception e)
			{
				System.out.println("Enter a valid number !");
				input.next();
			}
		}
		return var;
	}
	
	public static int intIdControl()
	{
		int id = 0;
		
		while(true)
		{
			try
			{
				System.out.print("ID (1-10) : ");
				id = input.nextInt();
				
				if(id <= 10 && id >=1)
				{
					break;
				}
				
				else
				{
					System.out.println("Please enter a valid id !");
					continue;
				}
			}
			
			catch(Exception e)
			{
				System.out.println("Please enter a valid id !");
				input.next();
			}
		}
		return id;
	}
	
	public static int intChoiceControl()
	{
		int choice = 0;
		
		while (true)
		{
			try
			{
				System.out.println("1-Check balance");
				System.out.println("2-Withdraw");
				System.out.println("3-Deposit");
				System.out.println("4-Exit");
				System.out.print("Choice :  ");
				
				choice = input.nextInt();
				
				if(choice <= 4 && choice >= 1)
				{
					break;
				}
				else
				{
					System.out.println("Please enter a valid choice !");
					continue;
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Please enter a valid choice !");
				input.next();
			}
		}
		return choice;
	}
}