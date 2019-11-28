public class ATM
{
	Account accounts[] = new Account[10];
	int choice = 0;
	int id = 0;
	
	public ATM()
	{
		for(int i = 0; i < 10; i++)
		{
			accounts[i] = new Account(i, 100);
		}
		
		id = InputControls.intIdControl();
				
		while(true)
		{	
			choice = InputControls.intChoiceControl();
				
			switch(choice)
			{
				case 1:
					System.out.println(accounts[id - 1].getBalance());
					break;
				case 2:
					double amount1;
					System.out.print("Enter an amount : ");
					amount1 = InputControls.doubleAmountControl();
					accounts[id - 1].withdraw(amount1);
					break;
				case 3:
					double amount2;
					System.out.print("Enter an amount : ");
					amount2 = InputControls.doubleAmountControl();
					accounts[id - 1].deposit(amount2);
					break;
				case 4:
					id = InputControls.intIdControl();
					break;
			}
		}
	}
}