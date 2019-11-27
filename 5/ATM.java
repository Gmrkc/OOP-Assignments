import java.util.*;

public class ATM
{
	Scanner input = new Scanner(System.in);
	
	Account accounts[] = new Account[10];
	int choice = 0;
	int id = 0;
	
	ATM()
	{
		for(int i = 0; i < 10; i++)
		{
			accounts[i] = new Account(i, 100);
		}
		
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
		
		while(true)
		{	
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
				
			switch(choice)
			{
				case 1:
					System.out.println(accounts[id - 1].getBalance());
					break;
				case 2:
					double amount1;
					System.out.print("Enter an amount : ");
					while (true)
					{
						try
						{
							amount1 = input.nextDouble();
							break;
						}
						catch(Exception e)
						{
							System.out.println("Please enter a valid amount !");
							input.next();
						}
					}
					accounts[id - 1].withdraw(amount1);
					break;
				case 3:
					double amount2;
					System.out.print("Enter an amount : ");
					while (true)
					{
						try
						{
							amount2 = input.nextDouble();
							break;
						}
						catch(Exception e)
						{
							System.out.println("Please enter a valid amount !");
							input.next();
						}
					}
					accounts[id - 1].deposit(amount2);
					break;
				case 4:
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
					break;
			}
		}
	}
}